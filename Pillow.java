public class Pillow {
    private State state;
 
    public Pillow(){
       state = null;
    }
 
    public void setState(State state){
       this.state = state;		
    }

    public State getState(){
       return state;
    }
}