public class Main{
    public static void main(String[] args){
    
            // Overloaded Constructors - allow a class to have multiple constructors with different parameter lists
            //                         - allows objects to be initialized in various ways
            
            User user1 = new User("Spongebob");
            
    
            System.out.println(user1.username);
            System.out.println(user1.email);
            System.out.println(user1.age);
    }
}