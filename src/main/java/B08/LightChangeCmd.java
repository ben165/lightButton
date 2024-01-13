package B08;

public class LightChangeCmd implements ICommand{
    private final Lights lights;

    public LightChangeCmd(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.switchChange();
    }
}
