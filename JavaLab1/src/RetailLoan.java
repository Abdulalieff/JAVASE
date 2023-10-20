class RetailLoan extends Loan {
    public RetailLoan(int id, double amount) {
        super(id, amount);
    }

    @Override
    public double calculateCommission() {
        return getAmount() * 0.015;
    }
}
