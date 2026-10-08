package Del1;

public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    @Override
    public String toString() {
        return widthCm + "X" + heightCm;
    }

    public int getAreaCm2() {
        return heightCm * widthCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public int getHeightCm() {
        return heightCm;
    }
}
