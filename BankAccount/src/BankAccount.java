public abstract class BankAccount {

    double balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public  abstract void  display();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
