/**
 * File name: StreetAddressArray
 * Author: Kevin Decena
 *
 * the program prints the addressList ’s addresses, one address per line
 * date created: 06.27.2022
 */

import java.util.ArrayList;

public class StreetAddressArray {
    public static void main(String[] args) {


        ArrayList<String> addressList = new ArrayList<>();
        addressList.add("1600 Pennsylvania Avenue");
        addressList.add("221B Baker Street");
        addressList.add("8700 N.W. River Park Drive");

        for (String address : addressList){
            System.out.println(address);
        }
    }
}