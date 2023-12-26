package StrategyPattern;

public class Vehicle {

    public DriveStrategy driveStrategy;

    // Constructor Injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
