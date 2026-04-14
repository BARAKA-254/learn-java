class Main{
    public static void main(String[] args){
        
        // Method Overriding = When a subclass provides a method implementation of a class that is aready defined
        //                   = Allows for code reusability and give specific implementation

        
        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.move();
        fish.move();

        
    }
}