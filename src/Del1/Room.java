package Del1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        this.lamps.add(lamp);
    }

    public void addWindow(Window window) {
        this.windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        int watt = 0;

        for(Lamp lamp : lamps) {
            watt += lamp.getWatt();
        }

        return watt;
    }

    public int getTotalWindowArea() {
        int area = 0;

        for(Window window : windows) {
            area += window.getAreaCm2();
        }

        return area;
    }

    public void printRoom() {
        System.out.println(name + " (" + lamps.size() + " lamps, " + windows.size() + " windows)");

        System.out.print("    Lamps: " + lamps.toString().replace("[", "").replace("]", ""));
        System.out.print(" (Total: " + getTotalWatt() + "W)");
        System.out.println();
        System.out.print("    Windows: " + windows.toString().replace("[", "").replace("]", ""));
        System.out.print(" (Total Area: " + getTotalWindowArea() + "cm2)");
        System.out.println();

    }
}
