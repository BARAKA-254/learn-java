public class Main {
    public static void main(String[] args){


        Car car = new Car("BMW", "M5", 2025, "BLUE", 10_000_000);

        System.out.println(car.getColor() + " " + car.getYear() + " " + car.getMake() + " " + car.getModel());
    }
}
