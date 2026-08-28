class Vehicle {
    String regNo;
    double dailyRate;

    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }

    void display() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Number of Doors: " + numDoors);
    }
}

public class Q1VehicleRental {
    public static void main(String[] args) {

        Car car = new Car("KL01AB1234", 1500, 4);

        car.display();

        System.out.println("Rent for 3 days: " +
                           car.computeRent(3));
    }
}