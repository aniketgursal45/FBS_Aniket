package Controller;
import Model.Room;
import java.util.*;
public class HouseController {
	private HouseDAO dao;
	
	public HouseController(){
		dao = new HouseDAO();
	}
	
	public void addRoom(Room room) {
		dao.addRoom(room);
	}
	
	List<Room> getRooms(){
		return dao.getRooms();
	}
	
	public void remoteTurnOnDevice(String roomId, String deviceId) {
		dao.turnOnDevice(roomId, deviceId);

	}
	
	public void remoteTurnOffDevice(String roomId, String deviceId){
		dao.turnOffDevice(roomId, deviceId);
	}
	
	public String getHouseStatus(){
		return dao.generateWholeHouseStatus();
	}

	public Room getRoomById(String roomId) {
	    return dao.findRoomById(roomId);
	}

}
