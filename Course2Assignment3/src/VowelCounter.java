/**
 * File name: VowelCounter.java
 * Author: Kevin Christian Decena
 *
 * Date Created: June 22, 2022
 * Details: Counts the uppercase, lowercase vowels
 *
 */


public class VowelCounter {
    private int aCount, eCount, iCount, oCount, uCount;
    private int ACount, ECount, ICount, OCount, UCount;


public void processLine(String userInput){ //used to process or count vowels
    char[] letters = userInput.toCharArray(); //converts to array
    for (char letter : letters) {
        switch (letter) {//counts Lowercase and Uppercase vowels
            case 'a' -> aCount++;
            case 'e' -> eCount++;
            case 'i' -> iCount++;
            case 'o' -> oCount++;
            case 'u' -> uCount++;
            case 'A' -> ACount++;
            case 'E' -> ECount++;
            case 'I' -> ICount++;
            case 'O' -> OCount++;
            case 'U' -> UCount++;
        }
    }
    }

    public void printSummary(){//prints total vowels counted
        System.out.print("A: ");
        System.out.println(aCount + " Lowercase "+ ACount + " Uppercase " + (aCount+ACount) + " total") ;
        System.out.print("E: ");
        System.out.println(eCount + " Lowercase "+ ECount + " Uppercase " + (eCount+ECount) + " total") ;
        System.out.print("I: ");
        System.out.println(iCount + " Lowercase "+ ICount + " Uppercase " + (iCount+ICount) + " total") ;
        System.out.print("O: ");
        System.out.println(oCount + " Lowercase "+ OCount + " Uppercase " + (oCount+OCount) + " total") ;
        System.out.print("U: ");
        System.out.println(uCount + " Lowercase "+ UCount + " Uppercase " + (uCount+UCount) + " total") ;
}

}//end VowelCounter


