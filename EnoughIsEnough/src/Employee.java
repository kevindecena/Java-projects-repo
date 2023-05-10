import java.util.Calendar;
import java.util.Scanner;

public abstract class Employee {

     String name;
     String ssNumber;
    int birthMonth;
     int birthWeek;
    double paycheck;


    Scanner input = new Scanner(System.in);

     public void load(){

    }

    public String getName() {
        return name;
    }



    public String getSsNumber() {
        return ssNumber;
    }



    public double getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }

    public double getEarnings(){
         return paycheck;
    }

    public boolean isBirthdayWeek(){
        System.out.println(Calendar.getInstance().get(Calendar.MONTH)+1);
        System.out.println(Calendar.getInstance().get(Calendar.WEEK_OF_MONTH));
        if(Calendar.getInstance().get(Calendar.MONTH)+1 == birthMonth && Calendar.getInstance().get(Calendar.WEEK_OF_MONTH) == birthWeek ) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", ssNumber='").append(ssNumber).append('\'');
        sb.append(", paycheck=").append(paycheck);
        sb.append('}');
        return sb.toString();
    }




}
