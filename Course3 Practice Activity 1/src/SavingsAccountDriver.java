import jdk.swing.interop.SwingInterOpUtils;

public class SavingsAccountDriver {
    public static void main(String[] args) {

        double balance, monthlyInterest;


        SavingsAccount user1 = new SavingsAccount("10002", 2000);
        SavingsAccount user2 = new SavingsAccount("10003", 3000);


        System.out.println("Monthly balances for one year with 0.05 annual interest:");
        System.out.printf("%10s %10s %10s %10s %10s", "Month", "Account #", "Balance", "Account #", "Balance\n");
        user1.setMontlyInterest(0.05);
        user2.setMontlyInterest(0.05);

        for(int i = 1; i <13; i++) {
            user1.addMonthlyInterest();
            user2.addMonthlyInterest();

            System.out.printf("%10s %10s %10s %10s %10s",  i, user1.getACCOUNT_NUMBER(), String.format("%.2f",user1.getBalance()), user2.getACCOUNT_NUMBER(), String.format("%.2f",user2.getBalance()));
            System.out.println();


            if (i == 12){
                System.out.println("Final balance of both accounts combined: "+ String.format("%.2f",(user1.getBalance()+user2.getBalance())));
            }

        }


        }
}