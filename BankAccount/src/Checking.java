public class Checking extends BankAccount{


    public Checking(int initialBal) {
        super();
    }

    public void display(){
        System.out.println("checking account balance: " + balance);
    }

    public void writeACheck(int checkAmt) {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checking{");
        sb.append("balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
