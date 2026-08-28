// Task 3 - Emergency Rescue Robot
// Demonstrates abstract class, abstract methods,
// interfaces and multiple inheritance.


// Abstract class
abstract class RescueRobot {

    protected int robotId;
    protected String robotName;


    // Constructor
    public RescueRobot(int robotId, String robotName) {

        this.robotId = robotId;
        this.robotName = robotName;
    }


    // Concrete method
    public void startRobot() {

        System.out.println(robotName + " has started.");
    }


    // Concrete method
    public void stopRobot() {

        System.out.println(robotName + " has stopped.");
    }


    // Abstract method
    public abstract void performMission();
}


// Flying capability
interface Flyable {

    void fly();
}


// Swimming capability
interface Swimmable {

    void swim();
}


// Climbing capability
interface Climbable {

    void climb();
}


// Flying rescue robot
class FlyingRescueRobot extends RescueRobot
                          implements Flyable {

    public FlyingRescueRobot(int robotId, String robotName) {

        super(robotId, robotName);
    }


    @Override
    public void fly() {

        System.out.println(robotName +
                " is flying to the rescue location.");
    }


    @Override
    public void performMission() {

        System.out.println(robotName +
                " is searching for people from the air.");
    }
}


// Amphibious rescue robot
class AmphibiousRescueRobot extends RescueRobot
                            implements Flyable, Swimmable {

    public AmphibiousRescueRobot(int robotId, String robotName) {

        super(robotId, robotName);
    }


    @Override
    public void fly() {

        System.out.println(robotName +
                " is flying over the disaster area.");
    }


    @Override
    public void swim() {

        System.out.println(robotName +
                " is swimming through flood water.");
    }


    @Override
    public void performMission() {

        System.out.println(robotName +
                " is rescuing people from flooded areas.");
    }
}


// Mountain rescue robot
class MountainRescueRobot extends RescueRobot
                          implements Climbable {

    public MountainRescueRobot(int robotId, String robotName) {

        super(robotId, robotName);
    }


    @Override
    public void climb() {

        System.out.println(robotName +
                " is climbing the mountain.");
    }


    @Override
    public void performMission() {

        System.out.println(robotName +
                " is rescuing people in mountainous areas.");
    }
}


// Hybrid rescue robot
// Supports flying, swimming and climbing.
class HybridRescueRobot extends RescueRobot
                         implements Flyable,
                                    Swimmable,
                                    Climbable {

    public HybridRescueRobot(int robotId, String robotName) {

        super(robotId, robotName);
    }


    @Override
    public void fly() {

        System.out.println(robotName + " is flying.");
    }


    @Override
    public void swim() {

        System.out.println(robotName + " is swimming.");
    }


    @Override
    public void climb() {

        System.out.println(robotName + " is climbing.");
    }


    @Override
    public void performMission() {

        System.out.println(robotName +
                " is performing a multi-terrain rescue mission.");
    }
}


// Main class
public class Task3EmergencyRescueRobot {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("         EMERGENCY RESCUE ROBOT");
        System.out.println("==============================================");


        // Abstract class references
        RescueRobot robot1 =
                new FlyingRescueRobot(101, "SkyRescue");

        RescueRobot robot2 =
                new AmphibiousRescueRobot(102, "AquaRescue");

        RescueRobot robot3 =
                new MountainRescueRobot(103, "MountainRescue");

        RescueRobot robot4 =
                new HybridRescueRobot(104, "AllTerrainRescue");


        // Robot 1
        System.out.println("\n--- Robot 1 ---");

        robot1.startRobot();
        robot1.performMission();
        robot1.stopRobot();


        // Robot 2
        System.out.println("\n--- Robot 2 ---");

        robot2.startRobot();
        robot2.performMission();
        robot2.stopRobot();


        // Robot 3
        System.out.println("\n--- Robot 3 ---");

        robot3.startRobot();
        robot3.performMission();
        robot3.stopRobot();


        // Robot 4
        System.out.println("\n--- Robot 4 ---");

        robot4.startRobot();
        robot4.performMission();
        robot4.stopRobot();


        // Interface references
        System.out.println("\n--- Interface References ---");


        Flyable flyingRobot =
                new FlyingRescueRobot(105, "AirRescue");

        flyingRobot.fly();


        Swimmable swimmingRobot =
                new AmphibiousRescueRobot(106, "WaterRescue");

        swimmingRobot.swim();


        Climbable climbingRobot =
                new MountainRescueRobot(107, "RockRescue");

        climbingRobot.climb();


        System.out.println("\n==============================================");
        System.out.println("       Rescue operations completed");
        System.out.println("==============================================");
    }
}