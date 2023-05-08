public class Party {
private final int maxNoOfGuest;
private int numberOfGuest;
private String [] guestList;
private String host;



public Party( int maxNoOfGuest,String host){
    this.maxNoOfGuest = maxNoOfGuest;
    this.host = host;
    this.guestList = new String[maxNoOfGuest];
}

public void addGuest(String guest){
        if (isOnList(guest)){
            System.out.println(guest + " is already on the list.");
        }
        else {
            if (numberOfGuest >= maxNoOfGuest) {
                System.out.println(guest + " cannot come to the party. The guest list is full.");
            } else {
                guestList[numberOfGuest] = guest;
                numberOfGuest++;
            }
        }

}

public void printParty(){
    for (int i = 0 ; i <= maxNoOfGuest -1; i++){
        System.out.println(guestList[i]);
    }
}

private boolean isOnList(String guest){
    for (String partyGuest: this.guestList) {
        if (guest.equals(partyGuest)) {
            return true;
        }
    }
    return false;
}
}
