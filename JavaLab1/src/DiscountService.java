interface DiscountService {
    double discountForLoanCommission(Customer customer);

    double discountForPaymentCommission(Customer customer);
}