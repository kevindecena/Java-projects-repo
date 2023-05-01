/**
 * Filename: PersonDriver.java
 * Author: Kevin Christian Decena
 *
 * date created: 06/22/2022
 *
 * Details: program creates new person with first and last name, also counts number of persons created
 *
 */

public class Person {
static int numOfPeople;
private String First, Last;

    public Person(){//0 parameter constructor with initial first and last name values
        First = "John";
        Last = "Doe";
        numOfPeople++;
    }

    public Person(String First, String Last){//2 parameter constructor
    this.First=First;
    this.Last=Last;
    numOfPeople++;
}

    public void setFirst(String First){//sets first name
        this.First=First;
    }

    public void setLast(String Last){//sets last name
        this.Last=Last;
    }

    public void printFullName(){//prints name
        System.out.println(First + " "+ Last);
    }

    public static int getNumOfPeople() {//getter for numOfPeople
        return numOfPeople;
    }
}
