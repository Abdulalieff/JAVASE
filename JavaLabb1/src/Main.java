// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CorpLoan corpLoan = new CorpLoan(1, 100);
        CorpCustomer corpCustomer = new CorpCustomer(1, "Ali", corpLoan);
        System.out.println("Final Comisssion for Corporate Customer: " + getFinalLoanCommission(corpCustomer));

        RetailLoan retailLoan = new RetailLoan(2,200);
        RetailCustomer retailCustomer = new RetailCustomer(3, "Lello", retailLoan);
        System.out.println("Final Commission for Retail Customer: " + getFinalLoanCommission(retailCustomer));

    }

    public static double getFinalLoanCommission(Customer customer){

        return customer.getLoan().getAmount() * (customer.getLoan().getComission() - customer.getDiscountForLoanCommission()) / 100;

    }
}