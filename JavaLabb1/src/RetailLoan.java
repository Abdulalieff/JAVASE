public class RetailLoan extends Loan{

    public RetailLoan(long id, double amount) {
        super(id, amount);
    }

    public RetailLoan() {
    }

    @Override
    public double getComission() {
        return 5;
    }
}
