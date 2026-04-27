import java.io.FileWriter;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Using FileWriter to create files
        Scanner scanner = new Scanner(System.in);
        System.out.println("THIS IS A FILE WRITER ");
        System.out.print("Enter the file name including the format: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {

            int fileCounter = 0;
            String userFile = " ";

            System.out.println("Type you file here: ");
            while(fileCounter < 5){
                
                if(fileCounter == 0){
                    userFile = scanner.nextLine().toUpperCase();
                }
                else{
                    userFile = userFile + "\n" + scanner.nextLine();
                }

                fileCounter++;
            }
            
            System.out.println("File has been saved");

            writer.write(userFile);
        } 
        catch (Exception e) {
            System.out.println("Something went wrong");    
        }
        finally{
            scanner.close();
        }
    }
}