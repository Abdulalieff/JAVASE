public class Main {
    public static void main(String[] args) {
        CorpLoan corpLoan = new CorpLoan(1, 100);
        RetailLoan retailLoan = new RetailLoan(2, 100);

        Customer corpCustomer = new CorpCustomer(11, "Corp LLC", corpLoan);
        Customer retailCustomer = new RetailCustomer(12, "Memmed", retailLoan);

        DiscountService discountService = new DiscountServiceImpl();

        double corpCustomerCommission = discountService.discountForLoanCommission(corpCustomer);
        double retailCustomerCommission = discountService.discountForLoanCommission(retailCustomer);

        System.out.println("Loan Commission for corporate customer " + corpCustomer.getName() +  ": " + corpCustomerCommission);
        System.out.println("Loan Commission for retail customer " + retailCustomer.getName() + ": " + retailCustomerCommission);
    }
}