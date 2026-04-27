import java.io.FileWriter;
public class Main{
    public static void main(String[] args){
        // Using FileWriter fo create files

        try (FileWriter writer = new FileWriter("test.txt")) {
            System.out.println("File has been written succesfully");

            writer.write("wazuuup twin");
        } 
        catch (Exception e) {
            System.out.println("Something went wrong");    
        }
    }
}