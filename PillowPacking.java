public class PillowPacking implements State{
    public void doAction(Pillow pillow){
        System.out.println("Packing Pillow...");
        pillow.setState(this);
    }
    public String toString(){
        return "Packing State";
    }
}
