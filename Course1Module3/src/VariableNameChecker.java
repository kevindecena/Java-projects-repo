/**
 * File name: VariableNameChecker
 * Author: Kevin Christian Decena
 * The program checks user input if it is good, illegal or legal but with poor style
 *
 * date created: 06/21/2022
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableNameChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String variableName = "";


        while (!variableName.equalsIgnoreCase("Q"))  {
            System.out.println("Enter a variable name(q to quit): ");
            variableName = input.nextLine(); //user input
            Pattern specialChar = Pattern.compile("[!@#%^&*()?><|}{+`.,/\\[\\]\\-~]");//declaration of illegal char
            Matcher illegalMatch = specialChar.matcher(variableName);

            if (Character.isDigit(variableName.charAt(0)) || illegalMatch.find() || variableName.contains(" "))
            {
                System.out.println("Illegal");
            }
            else if (Character.isUpperCase(variableName.charAt(0)) || variableName.contains("$") || variableName.contains("_")) {
                System.out.println("Legal, but uses poor style");
            }
            else if(variableName.equalsIgnoreCase("q")){
                return;
            }
            else {
                System.out.println("Good!");
            }
        }//end while loop
        input.close();//Scanner close
    }//end main
}//end VariableNameChecker class