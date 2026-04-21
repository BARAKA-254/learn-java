public class Library{
    int year;
    String name;
    Book[] books;

    Library(int year, String name, Book[] books){
        this.year = year;
        this.name = name;
        this.books = books;
    }

    public void displayInfo(){
        System.out.println("The " + this.year + " " + this.name + "Has the following books: ");

        for(Book book : books){
            book.displayInfo();
        }
    }
}