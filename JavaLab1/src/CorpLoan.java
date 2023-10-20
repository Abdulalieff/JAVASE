class CorpLoan extends Loan {
    public CorpLoan(int id, double amount) {
        super(id, amount);
    }

    @Override
    public double calculateCommission() {
        return getAmount() * 0.012;
    }
}