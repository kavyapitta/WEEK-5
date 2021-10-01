public class FillingPillow implements State{
    public void doAction(Pillow pillow){
        System.out.println("Blowing fabric in Pillow...");
        pillow.setState(this);
    }
    public String toString(){
        return "Filling State";
    }
}