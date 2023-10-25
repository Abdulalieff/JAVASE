public class CorpLoan extends Loan{

    public CorpLoan(long id, double amount) {
        super(id, amount);
    }

    public CorpLoan() {
    }

    @Override
    public double getComission() {
        return 1.2;
    }
}
