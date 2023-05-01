/**
 * Filename: PersonDriver.java
 * Author: Kevin Christian Decena
 *
 * date created: 06/22/2022
 *
 * Details: program creates new person with first and last name, also counts number of persons created
 *
 */

public class PersonDriver {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.printFullName();
        Person person2 = new Person("Matt", "Thebo");
        person2.printFullName();
        person1.setFirst("Paul");
        person1.setLast("John");
        person1.printFullName();
        System.out.println("Total number of people = " + Person.getNumOfPeople());
    } // end main

}//end PersonDriver
