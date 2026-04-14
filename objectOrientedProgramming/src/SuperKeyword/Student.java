public class Student extends Person{
    
    double GPA;

    Student(String first, String last, double GPA){

        super(first,last);

        this.GPA = GPA;
    }

    void showGPA(){
        System.out.println(this.first + "'s GPA is " + this.GPA);
    }
}