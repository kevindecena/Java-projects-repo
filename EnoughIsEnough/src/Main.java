import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter Number of Employees: ");
        int numberOfEmployees = input.nextInt();


        int counter =0;
        while (counter < numberOfEmployees) {

            System.out.println("type Hourly(1), Salaried(2), Salaried plus Commission(3)\n:");
            switch (input.nextInt()){
                case 1:{
                    Employee hourly = new Hourly();
                    hourly.load();

                    employees.add(hourly);

                    break;
                }
                case 2:
                {
                    Employee salaried = new Salaried();
                    salaried.load();

                    employees.add(salaried);
                    break;
                }
                case 3:  {
                    Employee commissioned = new SalariedPlusCommission();
                    commissioned.load();

                    employees.add(commissioned);
                    break;
                }

            }



            counter++;
        }

        for (Employee employee: employees) {
            System.out.println("Employee name: " + employee.getName());
            System.out.println("Social Security Number: " + employee.getSsNumber());
            System.out.println("Paycheck: " + employee.getPaycheck());
            System.out.println("");
        }

    }


}
