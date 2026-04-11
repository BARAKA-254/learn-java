import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        // INHERITANCE  =   One class inherits the methods and attributes from another class
        //                  Child inherits from parent

        Cat myCat = new Cat();
        Dog yourDog = new Dog();

        System.out.println(myCat.isAlive);
        yourDog.eat();

    }
    
}
