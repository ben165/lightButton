package B08;

public class Lights{
    private final Light lightLeft = new Light();
    private final Light lightRight = new Light();

    private ILightState state;

    public Lights() {

    }

    public void switchChange() {
        state.switchChange(this);
    }

    public void setState(ILightState state) {
        this.state = state;
    }

    public String toString() {
        return state.getState();
    }

}
