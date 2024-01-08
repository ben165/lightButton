import light.Lights;

public class Main {
    public static void main(String[] args) {

        var lights = new Lights();

        for (int i = 0; i<=10; i++) {
            System.out.println(lights.getStatus());
            lights.pressButton();
        }

    }
}
