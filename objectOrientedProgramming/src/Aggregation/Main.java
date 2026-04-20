public class Main{
    public static void main(String[] args){
 
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the container objects can exist independently

        Book book1 = new Book("The River Between", 500);


        book1.displayInfo();
    }
}