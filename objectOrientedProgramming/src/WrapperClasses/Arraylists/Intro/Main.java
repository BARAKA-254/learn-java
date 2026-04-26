import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //ArrayList =   A resizeable array that stores objects (autoboxing)
        //              Arrays are fixed in size but ArrayLists can change

        ArrayList<String> randomWords = new ArrayList<>();        

        randomWords.add("wazaap");
        randomWords.add("osns");
        randomWords.add("twin");
        randomWords.add("gooning");

        System.out.println(randomWords);
    }
}
