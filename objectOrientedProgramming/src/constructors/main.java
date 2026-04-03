public class main {
    public static void main(String [] args){


        //constructor - a special method to initialize objects
        //              you can pass arguments to a constructor and set  up initial values

        Student student1 = new Student("Spongebob",18,3.2);
        Student student2 = new Student("Patrick",21,1.5);
        Student student3 = new Student("Sandy", 20, 4.2);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        System.out.println();
        
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        System.out.println();
    }
    
}
