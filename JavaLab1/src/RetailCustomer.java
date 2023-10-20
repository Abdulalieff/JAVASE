class RetailCustomer extends Customer {
    public RetailCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double calculateFinalCommission() {
        return getLoan().calculateCommission() * 0.02;
    }
}