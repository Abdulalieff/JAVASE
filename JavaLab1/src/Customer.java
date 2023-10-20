abstract class Customer {
    private int id;
    private String name;
    private Loan loan;

    public Customer(int id, String name, Loan loan) {
        this.id = id;
        this.name = name;
        this.loan = loan;
    }

    public abstract double calculateFinalCommission();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Loan getLoan() {
        return loan;
    }
}