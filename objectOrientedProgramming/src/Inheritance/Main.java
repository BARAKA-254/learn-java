public class Main {
    public static void main(String[] args) {
        // INHERITANCE  =   One class inherits the methods and attributes from another class
        //                  Child inherits from parent

        Cat myCat = new Cat();
        Dog yourDog = new Dog();
        Plant plant = new Plant();

        System.out.println(myCat.isAlive);
        yourDog.eat();

        System.out.println("My cat has " + myCat.lives + " lives. Whereas your dog has " + yourDog.lives + " lives");

        myCat.speak();
        yourDog.speak();
        plant.photosynthesize();

    }
    
}
