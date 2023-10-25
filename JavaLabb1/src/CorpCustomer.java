public class CorpCustomer extends Customer{

    public CorpCustomer(long id, String name, CorpLoan corpLoan) {
        super(id, name, corpLoan);
    }

    public CorpCustomer() {
    }

    @Override
    public double getDiscountForLoanCommission() {
        return 0.5;
    }

    @Override
    public double getDiscountForPaymentCommission() {
        return 0;
    }
}
