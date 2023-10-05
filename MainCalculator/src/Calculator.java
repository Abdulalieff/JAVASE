import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
        public static void RunCalculator() {

            String[] operators = {"+","-","*","/"};

            System.out.print("Enter first digit: ");
            Scanner GetNumber = new Scanner(System.in);

            double FirstVal = GetNumber.nextDouble();

            System.out.print("Enter operator: ");
            Scanner GetOperator = new Scanner(System.in);
            String operator = GetOperator.next();

            System.out.print("Enter second digit: ");
            double SecondVal = GetNumber.nextDouble();

            double result = 0;
            if (!Arrays.asList(operators).contains(operator)) System.out.println("Not Valid Operator Entered");
            else {
                switch (operator) {
                    case "+":
                        result = MathMethods.sum(FirstVal, SecondVal);
                        break;
                    case "-":
                        result = MathMethods.subtract(FirstVal, SecondVal);
                        break;

                    case "*":
                        result = MathMethods.multiply(FirstVal, SecondVal);
                        break;

                    case "/":
                        if (!Double.isNaN(MathMethods.division(FirstVal, SecondVal))) result = MathMethods.division(FirstVal, SecondVal);
                        else {
                            System.out.println("Division by zero");
                            result = Double.NaN;
                        }
                        break;
                    default:
                        System.out.println("Incorrect operator entered");
                        break;
                }
                if (!Double.isNaN(result)) System.out.printf(FirstVal + " " + operator + " " + SecondVal + " = " + result);
            }
            }
        }