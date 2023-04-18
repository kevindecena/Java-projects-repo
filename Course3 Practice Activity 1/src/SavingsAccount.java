public class SavingsAccount {
    private double balance;
    private double annualInterestRate;

    private String ACCOUNT_NUMBER;
    public SavingsAccount(String ACCOUNT_NUMBER, int balance){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = balance;

    }
    public double setMontlyInterest(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        return annualInterestRate;
    }
    public double addMonthlyInterest(){

        balance += balance * annualInterestRate /12;
        return balance;
    }


    public double getBalance() {
        return balance;
    }
    public String getACCOUNT_NUMBER(){
        return ACCOUNT_NUMBER;
    }
}
