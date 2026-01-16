package Controller;

import java.util.*;
import Model.Room;
import Model.Device;
import Model.SmartDevice;

public class HouseDAO {

    private List<Room> rooms;

    public HouseDAO() {
        rooms = new ArrayList<>();
    }

    // 1. Add Room
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // 2. Return list of rooms
    public List<Room> getRooms() {
        return rooms;
    }

    // 3. Find Room by ID
    public Room findRoomById(String roomId) {
        for (Room r : rooms) {
            if (r.getRoomId().equals(roomId)) {
                return r;
            }
        }
        return null; // only after checking all rooms
    }

    // 4. Find Device by ID inside a Room
    public Device findDeviceById(Room room, String deviceId) {
        for (Device d : room.getDevices()) {
            if (d instanceof SmartDevice) {
                SmartDevice sd = (SmartDevice) d;
                if (sd.getDeviceId().equals(deviceId)) {
                    return d;
                }
            }
        }
        return null;
    }

    // 5. Turn ON device
    public void turnOnDevice(String roomId, String deviceId) {
        Room room = findRoomById(roomId);
        if (room != null) {
            Device device = findDeviceById(room, deviceId);
            if (device != null) {
                device.turnOn();
            }
        }
    }

    // 6. Turn OFF device
    public void turnOffDevice(String roomId, String deviceId) {
        Room room = findRoomById(roomId);
        if (room != null) {
            Device device = findDeviceById(room, deviceId);
            if (device != null) {
                device.turnOff();
            }
        }
    }

    // 7. Generate Full House Status
    public String generateWholeHouseStatus() {
        StringBuilder sb = new StringBuilder();

        for (Room room : rooms) {
            sb.append("Room: ").append(room.getName())
              .append(" (").append(room.getType().getTypeName()).append(")\n");

            for (Device device : room.getDevices()) {
                sb.append("   ")
                  .append(device.getStatusDetails())
                  .append(" | Time in state: ")
                  .append(device.getTimeInCurrentState())
                  .append(" ms\n");
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
