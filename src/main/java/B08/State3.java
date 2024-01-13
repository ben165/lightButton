package B08;

public class State3 implements ILightState{

    @Override
    public void switchChange(Lights lights) {
        lights.setState(new State0());
    }

    @Override
    public String getState() {
        return "S3";
    }
}
