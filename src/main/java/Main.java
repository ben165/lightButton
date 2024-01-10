import light.Control;
import light.ICommand;
import light.Lights;
import light.LightsCommand;

public class Main {
    public static void main(String[] args) {

        Control control = new Control();

        var lights = new Lights();

        ICommand switchChange = new LightsCommand(lights);

        control.setCommand(switchChange);

    }
}
