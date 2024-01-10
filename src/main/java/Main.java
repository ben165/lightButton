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
        System.out.println(lights.getState());
        control.setCommand(switchChange);
        control.pressButton();
        System.out.println(lights.getState());
    }
}
