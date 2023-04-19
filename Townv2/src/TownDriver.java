import java.util.Scanner;

public class TownDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter initial population for ADULTS on newTown: ");
        int initialAdults = input.nextInt();
        System.out.println("enter initial population for Children on newTown: ");
        int initialChildren = input.nextInt();

       Town newHome = new Town(initialAdults, initialChildren);
       newHome.simulateBirth();
       newHome.simulateBirth();
       newHome.printStatistics();
    }
}