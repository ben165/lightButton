package b20;

public class LightsCommand implements ICommand{

    private final Lights lights;

    public LightsCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void switchChange() {
        lights.stateChange();
    }

    @Override
    public String getStatus() {
        return lights.getState();
    }
}
