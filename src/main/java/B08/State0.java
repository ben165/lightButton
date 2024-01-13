package B08;

public class State0 implements ILightState{

    @Override
    public void switchChange(Lights lights) {
        lights.setState(new State1());
    }

    @Override
    public String getState() {
        return "S0";
    }
}
