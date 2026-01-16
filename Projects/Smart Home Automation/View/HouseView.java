package View;

import java.util.List;
import java.util.Scanner;

import Controller.HouseController;
import Model.Room;
import Model.RoomType;
import Model.Device;
import Model.Light;
import Model.AirConditioner;
import Model.Tv;
import Model.Shower;

public class HouseView {

    private HouseController controller;
    private Scanner sc = new Scanner(System.in);

    public HouseView(HouseController controller) {
        this.controller = controller;
    }

    public void showOptions() {

        int choice = -1;

        do {
            System.out.println("\n===== SMART HOME CONTROL SYSTEM =====");
            System.out.println("1. Add Room");
            System.out.println("2. Add Device to Room");
            System.out.println("3. Turn ON Device");
            System.out.println("4. Turn OFF Device");
            System.out.println("5. Display Whole House Status");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

            case 1:
                addRoomView();
                break;

            case 2:
                addDeviceToRoomView();
                break;

            case 3:
                turnOnDeviceView();
                break;

            case 4:
                turnOffDeviceView();
                break;

            case 5:
                System.out.println(controller.getHouseStatus());
                break;

            case 0:
                System.out.println("Exiting Smart Home System...");
                break;

            default:
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);
    }

    // ========== OPTION 1: ADD ROOM ==========
    private void addRoomView() {
        System.out.print("Enter Room ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Room Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String typeName = sc.nextLine();

        RoomType type = new RoomType(typeName);
        Room room = new Room(id, name, type);

        controller.addRoom(room);
        System.out.println("Room added successfully!");
    }

    // ========== OPTION 2: ADD DEVICE ==========
    private void addDeviceToRoomView() {

        System.out.print("Enter Room ID: ");
        String roomId = sc.nextLine();

        Room room = controller.getRoomById(roomId);
        if (room == null) {
            System.out.println("Room not found!");
            return;
        }

        System.out.print("Enter Device ID: ");
        String deviceId = sc.nextLine();

        System.out.print("Enter Device Name: ");
        String deviceName = sc.nextLine();

        System.out.println("Select Device Type:");
        System.out.println("1. Light");
        System.out.println("2. Air Conditioner");
        System.out.println("3. TV");
        System.out.println("4. Shower");

        System.out.print("Enter choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        Device device = null;

        switch (type) {

        case 1:
            device = new Light(deviceId, deviceName);
            break;

        case 2:
            System.out.print("Enter Target Temperature: ");
            int temp = sc.nextInt();
            sc.nextLine();
            device = new AirConditioner(deviceId, deviceName, temp);
            break;

        case 3:
            device = new Tv(deviceId, deviceName);
            break;

        case 4:
            device = new Shower(deviceId, deviceName);
            break;

        default:
            System.out.println("Invalid device type!");
            return;
        }

        room.addDevice(device);
        System.out.println("Device added successfully!");
    }

    // ========== OPTION 3: TURN ON DEVICE ==========
    private void turnOnDeviceView() {
        System.out.print("Enter Room ID: ");
        String roomId = sc.nextLine();

        System.out.print("Enter Device ID: ");
        String deviceId = sc.nextLine();

        controller.remoteTurnOnDevice(roomId, deviceId);
        System.out.println("Device turned ON!");
    }

    // ========== OPTION 4: TURN OFF DEVICE ==========
    private void turnOffDeviceView() {
        System.out.print("Enter Room ID: ");
        String roomId = sc.nextLine();

        System.out.print("Enter Device ID: ");
        String deviceId = sc.nextLine();

        controller.remoteTurnOffDevice(roomId, deviceId);
        System.out.println("Device turned OFF!");
    }
}
