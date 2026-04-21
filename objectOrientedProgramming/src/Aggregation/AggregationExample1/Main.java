public class Main{
    public static void main(String[] args){
 
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the container objects can exist independently

        Book book1 = new Book("The River Between", 500);
        Book book2 = new Book("Blossoms of The Savannah", 600);
        Book book3 = new Book("An Artist of the Erithrean Sea", 400);

        Book[] books = {book1, book2, book3};

        Library library = new Library(1957,"UpperHill National Library", books);

        library.displayInfo();
        
    }
}