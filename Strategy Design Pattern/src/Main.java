import StrategyPattern.OffRoadVehicle;
import StrategyPattern.SportsVehicle;
import StrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new OffRoadVehicle();
        vehicle2.drive();
    }
}