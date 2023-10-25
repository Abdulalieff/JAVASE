public class RetailCustomer extends Customer{

    public RetailCustomer(long id, String name, RetailLoan retailLoan) {
        super(id, name, retailLoan);
    }

    public RetailCustomer() {
    }

    @Override
    public double getDiscountForLoanCommission() {
        return 2;
    }

    @Override
    public double getDiscountForPaymentCommission() {
        return 0;
    }
}
