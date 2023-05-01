/**
 * Filename: IPAddressConversion
 * Author: Kevin Christian Decena
 * the program prints octet values from the dotted decimal IP format
 *
 * date created: 06/22/2022
 */

import java.util.StringTokenizer;

public class DottedDecimal {
    private String octet1, octet2, octet3, octet4, ipAddress;
    private int firstOctet, secondOctet, thirdOctet, fourthOctet;


    public DottedDecimal(String ipAddress) {
        this.ipAddress = ipAddress;

        StringTokenizer octet = new StringTokenizer(ipAddress, "."); // used tokenizer to divide the string to different octets
        octet1 = octet.nextToken(); //1st octet
        octet2 = octet.nextToken(); //2nd octet
        octet3 = octet.nextToken(); //3rd octet
        octet4 = octet.nextToken(); //4th octet

    }
    public String getDottedDecimal(){
        return this.ipAddress; // returns the value of the dotted ip address
    }

    public int getOctet(int number) {

        switch (number) {
            case 1:
                 firstOctet = Integer.parseInt(octet1); return firstOctet; // converts string to int, returns 1st octet
            case 2:
                secondOctet = Integer.parseInt(octet2); return secondOctet;// converts string to int, returns 2nd octet
            case 3:
               thirdOctet = Integer.parseInt(octet3); return thirdOctet;// converts string to int, returns 3rd octet
            case 4:
                fourthOctet = Integer.parseInt(octet4); return fourthOctet;// converts string to int, returns 4th octet

        }
        return number;
    }

}