import java.io.FileWriter;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Using FileWriter fo create files

        try (FileWriter writer = new FileWriter("test.txt"); Scanner scanner = new Scanner(System.in)) {

            int fileCounter = 0;
            String userFile = " ";

            System.out.println("Type you file here: (type : [fileWriter._save] ) to save file: ");
            while(fileCounter <= 5){
                
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
    }
}