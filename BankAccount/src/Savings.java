public class Savings extends BankAccount{


    public Savings(int initialBal, double intRate) {
        super();
    }

    public void display(
    ){
        System.out.println("Savings account balance: " + balance);
    }

    public void addInterest() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Savings{");
        sb.append("balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
