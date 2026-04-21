public class University{
    String name;
    int year;
    String[] facultyNames;
    Faculty[] faculties;

    University (String name, int year, String[] facultyNames, Faculty[] faculties){
        this.name = name;
        this.year = year;
        this.faculties  = faculties;
        this.facultyNames = facultyNames;
    }


    public void displayInfo(){
        System.out.println("The " + this.year + " " +  this.name + " has several faculties including: ");

        for(String facultyName : facultyNames){
            System.out.println(facultyName);
        }
    }
}