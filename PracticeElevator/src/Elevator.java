import javax.print.attribute.standard.PresentationDirection;
import java.util.concurrent.TimeUnit;

public class Elevator {
int currentFloor, targetFloor;
private static final int maxFloor = 10;
private static final int minFloor = 1;
static final int processingTime = 500;

public boolean goingUP, goingDown;



    public void moveUp(int targetFloor){
        this.targetFloor = targetFloor;

        currentFloor++;
        System.out.println("Moving Up to: " + targetFloor + " Floor Level " + currentFloor);

        setCurrentFloor(currentFloor);
    }

    public void moveDown(int targetFloor) throws InterruptedException {
        this.targetFloor = targetFloor;
        do {
            currentFloor--;
            System.out.println("Moving Down.. " + currentFloor);
            TimeUnit.MILLISECONDS.sleep(500);
        }while (!isHere());
        System.out.println("Arrived at floor level " + targetFloor);
        setCurrentFloor(currentFloor);

    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isHere(){
        return currentFloor == targetFloor;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }
}
