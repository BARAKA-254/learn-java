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

    // getter methods to make the attibutes above accessible from other classes
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

    // setter methods to make the attributes not declared as final modifiable from other classes
    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Car Details: \n" + this.color + " " + this.year + " " + this.make + " " + this.model + "\nPrice: " + this.price);
    }
}
