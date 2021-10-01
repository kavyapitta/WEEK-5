public class ConstructingPillowCovering implements State{
    public void doAction(Pillow pillow){
        System.out.println("Constructing Pillow covering...");
        pillow.setState(this);	
    }
    public String toString(){
        return "Cover Construction State";
    }
}

 