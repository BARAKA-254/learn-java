import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args){
        // Using FileWriter fo create files

        String textLine = " ";
        int lineCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your fileName along with the extesion: ");
        String fileName = scanner.nextLine();

        //while (lineCounter < 5) {
            try (FileWriter writer = new FileWriter(fileName)) {
                
                System.out.println("WRITE YOUR FILE HERE: ");
                textLine = scanner.nextLine();

                lineCounter++;

                writer.write(textLine);
            } 
            catch(FileNotFoundException e){
                System.out.println("File couldn't be printed!!");
            }
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something went wrong");
            }

            finally{
                scanner.close();
            }
            
        //}
        
       
        
    }
}