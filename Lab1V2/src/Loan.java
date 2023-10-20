abstract class Loan {
    private int id;


    public Loan(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    abstract double getComission();
}
