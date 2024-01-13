package B08;

public class State1 implements ILightState{

    @Override
    public void switchChange(Lights lights) {
        lights.setState(new State2());
    }

    @Override
    public String getState() {
        return "S1";
    }
}
