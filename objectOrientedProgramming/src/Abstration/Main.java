public class Main{
    public static void main(String[] args){
        
        //  Abstraction = the process of hiding the implementation details and showing only essential features
        //  abstract    = used to define abstract classes and methods
        //                Abstract classes can't be instatiated directly
        //                Can contain abstract methods which means they must be implemented
        //                Can contain concrete methods which means they are inherited

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println("The area of a rectangle "+ rectangle.area());
        System.out.println("The area of the circle is " +circle.area());
        System.out.println("The area of the triangle is " + triangle.area());
    }
}