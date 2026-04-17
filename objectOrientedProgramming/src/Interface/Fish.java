public class Fish implements Predator, Prey{
    @Override
    public void hunt() {
        System.out.println("*THE FISH IS HUNTING*");
    }
    
    @Override
    public void flee(){
        System.out.println("*THE FISH IS RUNNING AWAY*");
    }
}