class DiscountServiceImpl implements DiscountService {
    @Override
    public double discountForLoanCommission(Customer customer) {
        return customer.calculateFinalCommission();
    }

    @Override
    public double discountForPaymentCommission(Customer customer) {

        return 0;
    }
}