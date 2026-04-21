import javax.xml.stream.FactoryConfigurationError;

public class Main{
    public static void main(String[] args){
        
        Faculty SPAS = new Faculty("School of Pure and Applied Sciences", "B CS", "B SWE", "B IT");
        Faculty ENG = new Faculty("School Of Engineering", "Mechanical Engineering", "Electrical Engineering", "Civil Engineering");

        Faculty[] faculties = {SPAS,ENG};
        
        University KYU = new University("Kirinyaga University", 1973, faculties);

        System.out.println(KYU.name);
        System.out.println(SPAS.name);

    }
}