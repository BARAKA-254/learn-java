public class Main{
    public static void main(String[] args){
        // INTERFACE =  A blueprint for a class that specifies a set of abstract methods that 
        //              implementing classes must define

        //              Support multiple inheritance like behaviour 

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        hawk.hunt();
        rabbit.flee();
        
    }
}