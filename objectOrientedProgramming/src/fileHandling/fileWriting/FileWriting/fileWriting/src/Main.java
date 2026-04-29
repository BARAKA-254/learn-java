import java.io.FileWriter;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Using FileWriter fo create files

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your fileName along with the extesion: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
          System.out.println("File written successfully!!");
          
          writer.write("Wassup twin");
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }

        finally{
            scanner.close();
        }
        
    }
}