import java.io.FileWriter;
public class Main{
    public static void main(String[] args){
        // Using FileWriter fo create files

        try (FileWriter writer = new FileWriter("test.txt")) {
          System.out.println("File written successfully!!");  
        } 
        
        catch (Ex e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
        
    }
}