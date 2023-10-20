public class RetailLoan extends Loan{
    public RetailLoan(int id, int amount) {
        super(id, amount);
    }

    @Override
    double getComission() {
        return 1.2;
    }
}
