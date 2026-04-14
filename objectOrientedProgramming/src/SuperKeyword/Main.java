
public class Main{
    public static void main(String[] args){
        //Super =   refers to the parent class
        //          used in method overriding
        //          calls the parent constructor to initialize attributes

        Person person1 = new Person("Spongebob", "Squarepants");
        Student student = new Student("Patrick", "Star", 3.25);
        Employee employee = new Employee("Mohamed","Sumbul", 60000);

        person1.showName();
        System.out.println();

        student.showName();
        student.showGPA();
        System.out.println();

        employee.showName();
        employee.showSalary();
        
    }
}