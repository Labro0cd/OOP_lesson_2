public class ServiceStation implements CheckServices {
    @Override
    public void check(Car[] cars) {
        for (Car car : cars) {
            if (car != null) {
                System.out.println("Обслуживаем " + car.getModelName());
                for (int j = 0; j < car.getWheelsCount(); j++) {
                    car.updateTyre();
                }
                car.checkEngine();
            }
        }
    }
    @Override
    public void check(Truck[] trucks) {
        for (Truck truck:trucks) {
            if (truck != null) {
                System.out.println("Обслуживаем " + truck.getModelName());
                for (int i = 0; i < truck.getWheelsCount(); i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            }
        }
    }
    @Override
    public void check(Bicycle[] bicycles) {
        for (Bicycle bicycle : bicycles) {
            if (bicycle != null) {
                System.out.println("Обслуживаем " + bicycle.getModelName());
                for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                    bicycle.updateTyre();
                }
            }
        }
    }
    }

