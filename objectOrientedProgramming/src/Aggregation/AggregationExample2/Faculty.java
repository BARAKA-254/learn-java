public class Faculty{
    String name;
    String course1;
    String course2;
    String course3;
    String course4;


    Faculty(String name, String course1, String course2, String course3, String course4){
        this.name = name;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }

    public void displayInfo(){
        System.out.println("Faculty name: " + this.name);
        System.out.println("COURSES OFFERED: ");
        System.out.println(this.course1);
        System.out.println(this.course2);
        System.out.println(this.course3);
        System.out.println(this.course4);
    }
}