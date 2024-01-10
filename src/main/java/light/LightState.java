package light;

public abstract class LightState {
    int state;
    abstract void stateChange();
    abstract String getState();
}
