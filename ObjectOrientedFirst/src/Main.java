// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String staticwords  = "'s salary is: ";

        Employee employee = new Employee("Ali", 100);
        HRManager hrmanager = new HRManager("Zahra", 200);

        employee.Work();
        System.out.println(employee.name + staticwords + employee.GetSalary());

        hrmanager.Work();
        System.out.println(hrmanager.name + staticwords + hrmanager.GetSalary());

        hrmanager.AddEmployee(new Employee("John",500));

        }
    }
