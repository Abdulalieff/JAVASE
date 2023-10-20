
abstract class Loan {
    private int id;
    private double amount;

    public Loan(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public abstract double calculateCommission();

    public double getAmount() {
        return amount;
    }
}
