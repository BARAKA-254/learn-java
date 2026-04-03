public class Car{

    String make = "Ford";
    String model = "Mustang";
    int year = 2021; 
    boolean isRunning = false;
    String color = "Red";
    double price = 6000000;

    void start(){
        isRunning = true;
        System.out.println("Engine started");
    }
    void stop(){
        isRunning = false;
        System.out.println("Engine stopped");
    }

    void drive(){
        System.out.println("You drive a " + color  + " " + make + " " + model);
    }
    void lastModel(){
        System.out.println("The " + year + " " + make + " " + model + " was the last of it's kind" );
    }
}

 