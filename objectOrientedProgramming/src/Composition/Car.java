public class Car{
    String model;
    int year;
    Engine engine;

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public void displayInfo(){
        System.out.println("This is the " + this.year + " BMW " + this.model + " BI-TURBO " + this.engine.engineType);
    }

    public void Start(){
        System.out.println("The car is turning on");
        
        engine.startEngine();
    }
} 