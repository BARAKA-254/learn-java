public class Student{
    String name ;
    int age;
    double gpa;
    boolean isEnrolled;

    //constructor
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
    void read(){
        System.out.println(this.name + " is reading ");  
    }


}