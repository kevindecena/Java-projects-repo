

public class Hourly extends Employee{

    int hourlyPay;
    int hoursWorked;

    public void load(){
        System.out.println("ENTER your name: ");
        this.name = input.nextLine();
        System.out.println("ENTER your SSNumber: ");
        this.ssNumber = input.nextLine();
        System.out.println("ENTER your BirthMonth in MM: ");
        this.birthMonth = input.nextInt();
        System.out.println("ENTER your birthWeek: ");
        this.birthWeek = input.nextInt();

        System.out.println("ENTER hourly pay");
        this.hourlyPay = input.nextInt();
        System.out.println("ENTER hours worked for the week");
        this.hoursWorked = input.nextInt();
    }

    public double getEarnings(){

      this.paycheck = hourlyPay*hoursWorked;

      if (isBirthdayWeek()){
          paycheck += 100;
      }
      setPaycheck(paycheck);
        return paycheck;
    }


}
