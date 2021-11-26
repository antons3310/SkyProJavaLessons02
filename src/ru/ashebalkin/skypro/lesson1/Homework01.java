package ru.ashebalkin.skypro.lesson1;

public class Homework01 {
    public static final String DEVIDER = "########################################";

    public static void main(String[] args) {

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        Car[] cars = {
                new Car("Car1", 4),
                new Car("Car2", 4),
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        ServiceStation serviceStationForBicycle = new ServiceStationForBicycle();
        ServiceStation serviceStationForCars = new ServiceStationForCars();
        ServiceStation serviceStationForTrucks = new ServiceStationForTrucks();

        System.out.println(DEVIDER);
        serviceStationForBicycle.check(bicycles);
        System.out.println(DEVIDER);
        serviceStationForCars.check(cars);
        System.out.println(DEVIDER);
        serviceStationForTrucks.check(trucks);
        System.out.println(DEVIDER);
        System.out.println("Без реализации интерфейса");
        System.out.println(DEVIDER);


        //////////////////без реализации интерфеса///////////////////
        ServiceStation02 serviceStation02 = new ServiceStation02();

        for (Bicycle bicycle : bicycles) {
            serviceStation02.check(bicycle);
        }

        for (Car car : cars) {
            serviceStation02.check(car);
        }

        for (Truck truck : trucks) {
            serviceStation02.check(truck);
        }
        //////////////////////////////////////////////////////////////

    }

}
