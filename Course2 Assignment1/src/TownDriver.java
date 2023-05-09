/**
 * File name: TownDriver
 * Author: Kevin Christian Decena
 * the program simulates the population of a town. The user dictates the initial population
 * and how many children are added
 *
 * Date created: 06/21/2022
 */

import java.util.Scanner;

public class TownDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choices, numberOfAdults, numberOfChildren;//declaration of variables


        Town newTown = new Town();

        do {
            System.out.println("Enter No. of Adults: ");
            numberOfAdults = input.nextInt();
            if(numberOfAdults<=0){
                System.out.println("Enter atleast 1");
            }
        }while (numberOfAdults<=0);     //only accept 1 or more
            newTown.setNumberOfAdults(numberOfAdults);


        do{System.out.println("Enter No. of Children: ");
        numberOfChildren = input.nextInt();
            if(numberOfChildren<=0){
                System.out.println("Enter a positive number");
            }
        }while (numberOfChildren<0); //accepts 0 and more
        newTown.setNumberOfChildren(numberOfChildren);


        while (true) {
            System.out.println("press 1 to simulate birth of 1 child");
            System.out.println("press 2 to simulate birth of twins");
            System.out.println("press 3 to print current population");
            System.out.println("press 4 to Quit");
            choices = input.nextInt();


            switch (choices){
                case 1: newTown.simulateBirth();
                        continue;
                case 2: newTown.simulateBirth(); //twins run simulateBirth 2x
                        newTown.simulateBirth();
                    continue;
                case 3: newTown.printStatistics();
                    continue;
                case 4: break;
                default:
                    System.out.println("Enter 1-4 only");
                    continue;
            }//end switch
            break;

        }//end while
        input.close();
    }//end main
}//end TownDriver