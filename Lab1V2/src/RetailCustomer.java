public class RetailCustomer extends Customer{

    RetailLoan loan;
    public RetailCustomer(int id,String name, RetailLoan loan) {
        super(id, name, loan);
    }

    @Override
    double getComission() {
        return 2;
    }


}
