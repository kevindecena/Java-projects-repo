/**
 * File name: VowelCounter.java
 * Author: Kevin Christian Decena
 *
 * Date Created: June 22, 2022
 * Details: Counts the uppercase, lowercase, and total vowels
 *
 */

import java.util.Scanner;

public class VowelCounterDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        VowelCounter a = new VowelCounter();
        do {
        System.out.println("Enter a line of characters (press enter by itself to quit): ");
        userInput = input.nextLine();
           if(!userInput.isEmpty()) {
               a.processLine(userInput); //counts vowels in user input
           }
           else {
               a.printSummary(); //prints all counters
           }
        }while (!userInput.isEmpty());
input.close();
    }//end main
}//end VowelCounterDriver