public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    public Employee(String name){
        this.name = name;

    }

    public Employee(){

    }

    public void Work(){
        System.out.println(name + " is new Employee");
    }

    public double GetSalary(){
        return salary;
    }
}
