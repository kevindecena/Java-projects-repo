import java.util.StringTokenizer;

public class IpAddress {
    String dottedDecimal;
    String firstOctet, secondOctet, thirdOctet, fourthOctet;


    public IpAddress(String dottedDecimal) {
        this.dottedDecimal = dottedDecimal;

        StringTokenizer octet = new StringTokenizer(dottedDecimal, ".");
        firstOctet = octet.nextToken();
        secondOctet = octet.nextToken();
        thirdOctet = octet.nextToken();
        fourthOctet = octet.nextToken();
    }

    public String getOctet(int position){
      switch (position){
          case 1: return firstOctet;
          case 2: return secondOctet;
          case 3: return thirdOctet;
          case 4: return fourthOctet;
      }
        return null;
    }

    public String getDottedDecimal() {
        return dottedDecimal;
    }

}
