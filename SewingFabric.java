public class SewingFabric implements State{
    public void doAction(Pillow pillow){
        System.out.println("Sewing Pillow Fabric...");
        pillow.setState(this);
    }
    public String toString(){
        return "Sewing State";
    }
}