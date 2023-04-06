import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Elevator elevator = new Elevator();
        int currentFloorLevel, targetFloorLevel;

        System.out.println("Enter initial floor level (1-10): ");
        currentFloorLevel = input.nextInt();
        elevator.setCurrentFloor(currentFloorLevel);

        do {
            System.out.println("Enter Destination Level (1-10) press X to exit: ");
            targetFloorLevel = input.nextInt();
            if(targetFloorLevel > currentFloorLevel) {
                do {
                    elevator.moveUp(targetFloorLevel);
                    System.out.println("Do you want to enter elevator? ");
                    currentFloorLevel = elevator.getCurrentFloor();
                }while (!elevator.isHere());
            }
            else if (targetFloorLevel < currentFloorLevel){
                elevator.moveDown(targetFloorLevel);
                currentFloorLevel = elevator.getCurrentFloor();
            }
            else{
                System.out.println("target floor is the current floor");
            }

        }while (targetFloorLevel != 11);


    }
}