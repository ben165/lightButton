package light;

public class Control {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("--- pressButton");
        command.switchChange();
    }
}

