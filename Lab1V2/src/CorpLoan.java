public class CorpLoan extends Loan{
    public CorpLoan(int id, int amount) {
        super(id, amount);
    }

    @Override
    double getComission() {
        return 5; 
    }
}
