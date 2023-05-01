/**
 * Filename: IPAddressConversion
 * Author: Kevin Christian Decena
 * the program prints octet values from the dotted decimal IP format
 *
 * date created: 06/22/2022
 */
public class IPAddressConversion {
    public static void main(String[] args) {

        DottedDecimal ip =  new DottedDecimal("216.27.6.136");
        System.out.println(ip.getDottedDecimal());
        System.out.println(ip.getOctet(4));
        System.out.println(ip.getOctet(1));
        System.out.println(ip.getOctet(3));
        System.out.println(ip.getOctet(2));

    }//end main
}//end IPAddressConversion