package Del1;

public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    @Override
    public String toString() {
        return watt + "W";
    }

    public void toggle() {
        this.isOn = !this.isOn;
        System.out.println(this.isOn);
    }

    public int getWatt() {
        return this.watt;
    }
}
