public class Main{
    public static void main(String[] args){
 
        // toString() = Method inherited from the object class
        //              Used to return a string representation of an object
        //              By default it returns a hash code as a unique identifier
        //              It can be overriden to provide meaningful details


        Car car1 = new Car("BMW","M5CS", 2026, "BLUE");
        Car car2 = new Car("FORD","MUSTANG",2024,"RED");

        System.out.println(car1);
        System.out.println(car2);
    }
}