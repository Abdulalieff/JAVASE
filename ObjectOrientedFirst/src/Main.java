// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ali", 100);
        HRManager hrmanager = new HRManager("Zahra", 200);

        employee.Work();
        System.out.println(employee.name + "'s salary is: " + employee.GetSalary());

        hrmanager.Work();
        System.out.println(hrmanager.name + "'s salary is: " + hrmanager.GetSalary());

        hrmanager.AddEmployee(new Employee("John",500));

        }
    }
