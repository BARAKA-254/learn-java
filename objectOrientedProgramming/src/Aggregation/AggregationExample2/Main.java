public class Main{
    public static void main(String[] args){
        
        Faculty SPAS = new Faculty("School of Pure and Applied Sciences", "BSC CS", "BSC SWE", "BSC IT", "BSC PHYSICS");
        Faculty ENG = new Faculty("School Of Engineering", "Mechanical Engineering", "Electrical Engineering", "Civil Engineering", "Mechatronics Engineering");
        Faculty HEALTH = new Faculty("School Of Medicine and Health Sciences", "Medicine", "Nursing", "Pharmacy", "Medical Engineering");


        String[] facultyNames = {"SPAS", "ENG", "HEALTH"};

        Faculty[] faculties = {SPAS,ENG,HEALTH};

        
        University KYU = new University("Kirinyaga University", 1973, facultyNames, faculties);

        
        KYU.displayInfo();
        //System.out.println();
        //SPAS.displayInfo();

    }
}