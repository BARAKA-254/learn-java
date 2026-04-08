import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.rmi.server.UID;

public class Main{
    public static void main(String[] args){
    
            // Overloaded Constructors - allow a class to have multiple constructors with different parameter lists
            //                         - allows objects to be initialized in various ways
            
            User user1 = new User("Spongebob");
            User user2 = new User("Patrick","pStar@gmail.com");
            User user3 = new User("Sandy", "sCheekSandy@gmail.com", 21);
            User user4 = new User();
            
    
            System.out.println(user1.username);
            System.out.println(user1.email);
            System.out.println(user1.age);
            System.out.println();

            System.out.println(user2.username);
            System.out.println(user2.email);
            System.out.println(user2.age);
            System.out.println();

            System.out.println(user3.username);
            System.out.println(user3.email);
            System.out.println(user3.age);
            System.out.println();

            // guest 
            System.out.println(user4.username);
            System.out.println(user4.email);
            System.out.println(user4.age);
    }
}