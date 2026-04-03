public class main {
    public static void main(String [] args){


        //constructor - a special method to initialize objects
        //              you can pass arguments to a constructor and set  up initial values

        Student student1 = new Student("Spongebob",18,3.2);
        Student student2 = new Student("Patrick",21,1.5);

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
    
}
