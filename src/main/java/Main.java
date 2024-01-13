import B08.*;

public class Main {
/*
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
 */
    public static void main(String[] args) {
        Lights lights = new Lights();
        lights.setState(new State0());

        ICommand lightsChange = new LightChangeCmd(lights);
        System.out.println(lights.toString());
        lightsChange.execute();
        System.out.println(lights.toString());
        lights.switchChange();
        System.out.println(lights.toString());
        lights.switchChange();
        System.out.println(lights.toString());
        lights.switchChange();
        System.out.println(lights.toString());
        lights.switchChange();
        System.out.println(lights.toString());
        lights.switchChange();
        System.out.println(lights.toString());






    }
}
