public class CorpCustomer extends Customer{

    CorpLoan loan;
    public CorpCustomer(int id, String name, CorpLoan loan) {
        super(id, name, loan);
    }

    @Override
    double getComission() {
        return 0.5;
    }
}
