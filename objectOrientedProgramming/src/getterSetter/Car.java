public class Car {
    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int price;

    Car(String make, String model, int year, String color, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }
    
    public String getColor(){
        return this.color;
    }

    public int getPrice(){
        return this.price;
    }
}
