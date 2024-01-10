package light;

public class Lights extends LightState{
    //private int state = 0;
    private final Light lightLeft = new Light();
    private final Light lightRight = new Light();

    public Lights() {

    }

    @Override
    public void stateChange() {
        if (state == 3) {
            state = 0;
        } else {
            state++;
        }
        lightLeft.setState(state);
        lightRight.setState(state);
    }

    public String getState() {
        return "S" + state;
    }
}
