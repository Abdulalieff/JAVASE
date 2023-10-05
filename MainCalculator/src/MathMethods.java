public class MathMethods {
        public static double sum(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double division(double a, double b) {
            return (b == 0) ? Double.NaN : (double) a / b;
        }
    }
