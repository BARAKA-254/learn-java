public class Main {
    public static void main(String[] args){
        
        Car car1 = new Car("BMW", "blue");
        Car car2 = new Car("MERCEDES", "grey");
        Car car3 = new Car("AUDI", "black");

        //create an array of objects
        Car[] cars = new Car[3];
        
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        for(Car car : cars){
            System.out.println(car.color +  " " + car.model);
            car.drive();
            System.out.println();
        }
    }
}
