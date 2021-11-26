package ru.ashebalkin.skypro.lesson1;

public class ServiceStationForBicycle implements ServiceStation {

    @Override
    public void check(Bicycle[] bicycles) {
        for (Bicycle bicycle : bicycles) {
            updateTyre(bicycle);
        }
    }

    @Override
    public void check(Car[] cars) {

    }

    @Override
    public void check(Truck[] trucks) {

    }

    private void updateTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

}
