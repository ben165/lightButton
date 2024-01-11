import b20.Control;
import b20.ICommand;
import b20.Lights;
import b20.LightsCommand;

public class Main {
    public static void main(String[] args) {

        var control = new Control();
        var lights = new Lights();

        ICommand switchChange = new LightsCommand(lights);

        control.setCommand(switchChange);
        System.out.println(lights.getState());
        control.setCommand(switchChange);
        control.pressButton();
        System.out.println(lights.getState());
    }
}
