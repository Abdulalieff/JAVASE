class CorpCustomer extends Customer {
    public CorpCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double calculateFinalCommission() {
        return getLoan().calculateCommission() * 0.005;
    }


}