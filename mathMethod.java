import java.util.Scanner;
class mathMethod{
    public static void main(String [] args){

        System.out.println(Math.PI); // PI method
        System.out.println(Math.E); // Exponential constant
    
        // Finding the hypotenuse

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter measurement of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the measurement of side b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

        System.out.printf("The hyponuse c is: %.2f \n", c);

        

        // Calculating circumference, area, and volume of a sphere.
        

        
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = Math.PI * 2 * radius;
        System.out.printf("Circumference: %.2f \n",circumference);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area: %.2f \n", area);

        double volume = (4 / 3) * Math.PI * Math.pow(radius,2);
        System.out.printf("Volume: %.2f \n", volume);

        scanner.close();

    }
}