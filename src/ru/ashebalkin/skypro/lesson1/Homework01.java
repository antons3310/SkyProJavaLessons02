package ru.ashebalkin.skypro.lesson1;

public class Homework01 {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Vehicle[] vehicles = {
                bicycle1,
                bicycle2,
                car1,
                car2,
                truck1,
                truck2
        };
        
        ServiceStation serviceStation = new ServiceStation();

        for (Vehicle vehicle : vehicles) {
            serviceStation.check(vehicle);
        }
    }
}
