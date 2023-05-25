/**
 * File name: PhoneNumberDissector
 * Author: Kevin Christian Decena
 * the program separates the country, area, and local numbers
 *
 * date created: 06/21/2022
 */

import java.util.Scanner;

public class PhoneNumberDissector {
    public static void main(String[] args) {
        String code = "";
        Scanner input = new Scanner(System.in);

        while (!code.equalsIgnoreCase("Q")) {
            System.out.println("Enter a phone number in the form CC-AREA-LOCAL.");
            System.out.println("cc = country code digits, area= area code digits, local= local phone number");
            System.out.println("press Q to quit : ");
            code = input.nextLine();//user input code

            if(!code.equalsIgnoreCase("q")) {
                int index = code.indexOf('-'); //1st index
                int secondIndex = code.indexOf('-', index + 1); //2nd index

                System.out.println("country code: " + code.substring(0, index));
                System.out.println("Area code: " + code.substring(index + 1, secondIndex));
                System.out.println("Local phone number: " + code.substring(secondIndex + 1));
            }
            else{
                return;
            }
        }//end while loop
        input.close();//Scanner close
    }//end main
}//engPhoneNumberDissector