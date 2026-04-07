public class User {
    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "NOT PROVIDED";
        this.age = 0;
    }    
    // overloaded constructor
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }    
    // another overloaded constructor
    User(String username, String email, int age)[
        this.username = username;
        this.email = email;
        this.age = age;
    ]
}
