package light;

public class LightsCommand implements ICommand{

    private Lights lights;

    public LightsCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void switchChange() {
        this.lights.getLight1().switchChange();
        this.lights.getLight2().switchChange();
    }

    @Override
    public String getStatus() {
        return this.lights.getLight1().getStatusStr();
    }
}
