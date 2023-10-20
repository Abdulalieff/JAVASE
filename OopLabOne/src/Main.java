// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CorpLoan corpLoan = new CorpLoan(1, 100);
        RetailLoan retailLoan = new RetailLoan(2, 200);

        CorpCustomer corpCustomer = new CorpCustomer(11, "CorpCustomer", corpLoan);
        RetailCustomer retailCustomer = new RetailCustomer(22, "RetailCustomer", retailLoan);

        DistcountService discountService = new DistcountService();

        double corpLoanCommission = discountService.discountForLoanCommission(corpCustomer);
        double retailLoanCommission = discountService.discountForLoanCommission(retailCustomer);

        double corpPaymentCommission = discountService.discountForPaymentCommission(corpCustomer);
        double retailPaymentCommission = discountService.discountForPaymentCommission(retailCustomer);

        System.out.println("Corp Customer Loan Commission: " + (corpLoanCommission + corpPaymentCommission) );
        System.out.println("Retail Customer Loan Commission: " + (retailLoanCommission + retailPaymentCommission) );


    }
}