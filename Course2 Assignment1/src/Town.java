/**
 * File name: Town
 * Author: Kevin Christian Decena
 * the program simulates the population of a town. The user dictates the initial population
 * and how many children are added
 *
 * Date created: 06/21/2022
 */
public class Town {

    private int numberOfAdults,numberOfChildren;

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults; //no. of adults in town
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren; // no. of children in town
    }

    public void simulateBirth(){
        System.out.println("A child is born");
        numberOfChildren++; // adds 1 child to the population

    }

    public void printStatistics(){ //prints current population
        System.out.println("There are " + numberOfAdults + " adults");
        System.out.println("There are " + numberOfChildren + " children");

    }
}
