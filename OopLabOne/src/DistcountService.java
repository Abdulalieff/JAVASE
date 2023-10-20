public class DistcountService {
    public double discountForLoanCommission(Customer customer) {
        if (customer instanceof CorpCustomer) return customer.getLoanCommission() - customer.getLoanCommission() * 1.2;
        else if (customer instanceof RetailCustomer) return customer.getLoanCommission() - customer.getLoanCommission() * 5;
        return 0;
    }

    public double discountForPaymentCommission(Customer customer) {
        if (customer instanceof CorpCustomer) return customer.getLoanCommission() - customer.getLoanCommission() *  0.5;
        else if (customer instanceof RetailCustomer) return customer.getLoanCommission() - customer.getLoanCommission() * 2;
        return 0;
    }
}
