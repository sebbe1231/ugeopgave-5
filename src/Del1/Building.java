package Del1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int count = 0;

        for(Room room : rooms) {
            count += room.getLampCount();
        }

        return count;
    }

    public int getTotalWatt() {
        int watt = 0;

        for(Room room : rooms) {
            watt += room.getTotalWatt();
        }

        return watt;
    }

    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        System.out.println();
        for(Room room : rooms) {
            room.printRoom();
            System.out.println();
        }

        System.out.println("Total: " + getTotalLampCount() + "lamps, " + getTotalWatt() + "W");
    }
}
