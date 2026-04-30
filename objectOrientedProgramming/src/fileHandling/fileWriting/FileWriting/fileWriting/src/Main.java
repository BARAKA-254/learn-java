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

        try (FileWriter writer = new FileWriter(fileName)) {
                
            System.out.println("WRITE YOUR FILE HERE: ");
                while (lineCounter < 5) {
                    if(lineCounter == 0){
                    textLine = scanner.nextLine();
                }
                else{
                    textLine = textLine + " \n" + scanner.nextLine();
                }

                System.out.println("File writtenn succesfully");
                lineCounter++;
            }   
            
            

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
        
    }
}