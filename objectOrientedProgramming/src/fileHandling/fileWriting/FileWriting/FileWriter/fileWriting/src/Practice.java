import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        System.out.println("FILE WRITER");

        String fileName ;
        int fileCounter = 0;
        String fileLine = " ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file Name with it's file type: ");
        fileName = scanner.nextLine();

        try ( FileWriter writer = new FileWriter(fileName); ) {
            System.out.println("WRITE YOUR FILE BELOW: ");
            while(fileCounter < 5){
                if(fileCounter == 0){
                    fileLine = scanner.nextLine();
                }
                else{
                    fileLine = fileLine + "\n" + scanner.nextLine();
                }

                fileCounter ++;
            }
            System.out.println("File Written");
           writer.write(fileLine);
        } 

        catch(IOException e){
            System.out.println("There was a problem with reading the writing");
        }

        catch (Exception e) {
            System.out.println("Something went wrong");   
        }

        finally{
            scanner.close();
        }
       

        
    }
}