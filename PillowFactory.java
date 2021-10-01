public class PillowFactory {
    public static Pillow createPillow() {
        Pillow pillow = new Pillow();

        ConstructingPillowCovering firstState = new ConstructingPillowCovering();
        firstState.doAction(pillow);
        System.out.println(pillow.getState().toString());
  
        SewingFabric secondState = new SewingFabric();
        secondState.doAction(pillow);
        System.out.println(pillow.getState().toString());
        
        FillingPillow thirdState = new FillingPillow();
        thirdState.doAction(pillow);
        System.out.println(pillow.getState().toString());

        PillowPacking fourthState = new PillowPacking();
        fourthState.doAction(pillow);
        System.out.println(pillow.getState().toString());

        return pillow;
    }
}