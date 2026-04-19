public class Main{
    public static void main(String[] args){
        // Polymorphism =   an oop concept that describes that an object can take different forms
        // Poly         =   means many
        // morph        =   means shape
        //                  objects can identify as other objects
        //                  objects can be treated as objects of a common superclass

        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        // to store all the objects above, we need an array of Vehicle since all the above objects can also identify as Vehicles

        Vehicle[] vehicles = {car, boat, bike};

        // use a for loop to call the go method on each one of these vehicles

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
           
    }
}