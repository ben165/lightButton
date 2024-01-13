
import B08.Control;
import B08.ICommand;
import B08.Lights;
import B08.LightsCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApplication {

    private Control control;
    private Lights lights;

    @BeforeEach
    public void setup() {
        this.control = new Control();
        this.lights = new Lights();
    }


    /*
    @Test
    @Order(1)

    public void switchTest() {
        ArrayList<String> states = new ArrayList<>();

        ICommand switchChange = new LightsCommand(lights);
        control.setCommand(switchChange);

        for (int i=0; i<5; i++) {
            states.add(lights.);
            control.pressButton();
        }

        assertEquals("S0", states.get(0));
        assertEquals("S1", states.get(1));
        assertEquals("S2", states.get(2));
        assertEquals("S3", states.get(3));
        assertEquals("S0", states.get(4));
    }

     */

}
