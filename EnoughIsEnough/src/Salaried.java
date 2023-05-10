public class Salaried extends Employee{

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

    }

  public double getEarnings(){
        paycheck = weeklySalary;
      if (isBirthdayWeek()){
          paycheck += 100;
      }
      setPaycheck(paycheck);
        return paycheck;
  }


}
