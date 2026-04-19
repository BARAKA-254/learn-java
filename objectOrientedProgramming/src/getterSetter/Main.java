public class Main {
    public static void main(String[] args){

        // They help protect data and add rules for accesing and modifiying data
        // GETTERS  =   methods that make a field READABLE
        // SETTERS  =   methods that make a field WRITEABLE

        Car car = new Car("BMW", "M5", 2025, "BLUE", 10_000_000);

        System.out.println(car.getColor() + " " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " Price: " + car.getPrice());

        car.setColor("RED");
        car.setPrice(9_700_500);

        System.out.println(car.getColor() + " " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " Price: " + car.getPrice());
        System.out.println();

        car.displayInfo();
    }
}
