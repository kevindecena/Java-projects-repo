public class Town {

    private int numberOfAdults;
    private int numberOfChildren;

    public Town(int numberOfAdults, int numberOfChildren) {
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
    }

    public int simulateBirth(){
       numberOfChildren += 1;
       return numberOfChildren;
    }

    public void printStatistics(){
        System.out.println("new population is: ");
        System.out.println("number of adults: " + numberOfAdults);
        System.out.println("number of children: " + numberOfChildren);
    }
}
