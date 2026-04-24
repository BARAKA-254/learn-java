public class Main{
    public static void main(String[] args){
        //Composition   =   Represents a "part of" relationship between objects.
        //                  For example an engine is part of a car
        //                  Allows complex object to be constructed from smaller object

        Car car = new Car("M5", 2025, "V8");

        car.displayInfo();

        car.Start();
    }
}