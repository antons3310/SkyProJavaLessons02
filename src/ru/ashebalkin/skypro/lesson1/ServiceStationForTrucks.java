package ru.ashebalkin.skypro.lesson1;

public class ServiceStationForTrucks implements ServiceStation {
    @Override
    public void check(Bicycle[] bicycles) {

    }

    @Override
    public void check(Car[] cars) {

    }

    @Override
    public void check(Truck[] trucks) {
        for (Truck truck : trucks) {
            updateTyre(truck);
            checkEngine();
            checkTrailer();
        }
    }


    private void updateTyre(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
