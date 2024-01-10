package light;

public class Light{
    private int status;

    public Light() {
        this.status = 0;
    }

    public void switchChange() {
        if (status == 3) {
            status = 0;
        } else {
            status++;
        }
    }

    public int getStatus() {
        return status;
    }

    public String getStatusStr() {
        return "S" + status;
    }
}
