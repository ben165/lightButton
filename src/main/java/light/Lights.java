package light;

import helper.LightStatusName;

public class Lights implements IButton{

    int status;
    Light[] lights = new Light[2];

    public Lights() {
        lights[0] = new Light();
        lights[1] = new Light();
        status = 0;
    }

    @Override
    public void pressButton() {
        if (status == 3) {
            status = 0;
        } else {
            status++;
        }
        for (Light light : lights) {
            light.setStatus(status);
        }
    }

    @Override
    public String getStatus() {
        return LightStatusName.getStatusName(status);
    }
}
