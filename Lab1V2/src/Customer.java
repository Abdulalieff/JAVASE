abstract class Customer {
    private int id;
    private String name;
    private Loan loan;

    public Customer(int id, String name, Loan loan) {
        this.id = id;
        this.name = name;
        this.loan = loan;
    }

    public double getLoanCommission() {
        return loan.getAmount();
    }

    abstract double getComission();

}
