package ru.ashebalkin.skypro.lesson1;

public class ServiceStationForCars implements ServiceStation {
    @Override
    public void check(Bicycle[] bicycles) {

    }

    @Override
    public void check(Car[] cars) {
        for (Car car : cars) {
            updateTyre(car);
            checkEngine();
        }
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

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
