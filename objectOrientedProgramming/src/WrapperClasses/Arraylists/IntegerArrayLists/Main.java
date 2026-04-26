import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // ArrayLists cannot be used with primitive datatypes, we therefore use their Wrapper classes in order to work with
        //  ArrayLists


        ArrayList<Integer> idNumbers = new ArrayList<>();
        
        idNumbers.add(2431065);
        idNumbers.add(1985019);
        idNumbers.add(3871965);
        idNumbers.add(8876554);

        System.out.println("Unsorted: " + idNumbers);
    }    
}