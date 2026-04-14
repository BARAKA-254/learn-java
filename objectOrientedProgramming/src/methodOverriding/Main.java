class Main{
    public static void main(String[] args){
        
        // Method Overriding = When a subclass provides a method implementation of a class that is aready defined
        //                   = Allows for code reusability and give specific implementation

        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

        
    }
}