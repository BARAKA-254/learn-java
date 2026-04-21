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


    // display the university name together with the faculties within the university
    public void displayInfo(){
        System.out.println("The " + this.year + " " +  this.name + " has several faculties including: ");

        for(String facultyName : facultyNames){
            System.out.println(facultyName);
        }
    }

    // display university name, the faculties within the university and the courses offered in each university
    public void displayDetailedInfo(){
        System.out.println("The " + this.year + " " +  this.name + " offers several courses including: \n");

        // Outer loop iterates through every element in the faculty names array
        for(int i = 0; i < facultyNames.length; i++){
            System.out.println(facultyNames);
            
            // for every iteration, call the displayInfo() method for the element in the index position from the faculties array which displays the courses offered in every faculty        
            faculties[i].displayInfo();
            System.out.println();   
        }
    }
}