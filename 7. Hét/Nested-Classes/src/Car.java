public class Car {
    private String fuelType;

    class Engine {
        public void start() {
            System.out.println(String.format("Starting with %s typa fuel", fuelType));
        }
    }

    public Car(String fuelType) {
        this.fuelType = fuelType;
        new Engine().start();
    }
}
