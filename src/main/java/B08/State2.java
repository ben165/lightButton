package B08;

public class State2 implements ILightState{

    @Override
    public void switchChange(Lights lights) {
        lights.setState(new State3());
    }

    @Override
    public String getState() {
        return "S2";
    }
}
