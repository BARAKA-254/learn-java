public class Main{
    public static void main(String[] args){

        //Static =  makes the variable or method belong to the class rather than any specific object
        //          Commonly used for shared resources or utility methods

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        System.out.println();

        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);
    }
}