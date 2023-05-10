public class SalariedPlusCommission extends Employee{

 int weeklySales;
 double commissionRate;
    int weeklySalary;
    public void load(){
        System.out.println("ENTER your name: ");
        this.name = input.nextLine();
        System.out.println("ENTER your SSNumber: ");
        this.ssNumber = input.nextLine();
        System.out.println("ENTER your BirthMonth in MM: ");
        this.birthMonth = input.nextInt();
        System.out.println("ENTER your birthWeek: ");
        this.birthWeek = input.nextInt();

        System.out.println("ENTER weekly pay");
        this.weeklySalary = input.nextInt();
        System.out.println("ENTER hourly pay");
        this.weeklySales = input.nextInt();
        System.out.println("ENTER hours worked for the week");
        this.commissionRate = input.nextDouble();
    }


    public double getEarnings(){
        paycheck = weeklySalary + (weeklySales*commissionRate);
        if (isBirthdayWeek()){
            paycheck += 100;
        }
        setPaycheck(paycheck);
        return paycheck;
    }
}
