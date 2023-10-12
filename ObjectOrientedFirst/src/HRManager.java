public class HRManager extends Employee {

    public HRManager(String name, double salary){
        super(name, salary);
    }

    public HRManager(){
    }
    @Override
    public void Work(){
        System.out.println(super.name + " is new HR Manager");
    }

    public void AddEmployee(Employee newemployee){
        System.out.println("HR Manager " + super.name + " adding new employee: " + newemployee.name + " with the salary " + newemployee.GetSalary());
    }

}
