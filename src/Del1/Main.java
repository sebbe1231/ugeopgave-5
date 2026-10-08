package Del1;

public class Main {
    void main() {
        Room room1 = new Room("Conference room");
        room1.addLamp(new Lamp(200));
        room1.addLamp(new Lamp(10));
        room1.addWindow(new Window(190, 80));

        Room room2 = new Room("Hall");
        room2.addLamp(new Lamp(300));
        room2.addWindow(new Window(200, 180));
        room2.addWindow(new Window(200, 180));

        Room room3 = new Room("Office");
        room3.addLamp(new Lamp(150));
        room3.addLamp(new Lamp(130));
        room3.addWindow(new Window(100, 100));

        Building building = new Building("Office Building");
        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        building.printBuilding();
    }
}
