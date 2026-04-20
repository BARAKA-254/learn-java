public class Book{
    
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages =  pages;
    }

    public void displayInfo(){
        System.out.println(this.title + " (" + this.pages + " pages)");
    }
}