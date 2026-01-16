package Model;
import java.util.*;
public class Room {
	private String roomId;
	private String name;
	private RoomType type;
	private List<Device> devices;

	public Room(String roomId,String name,RoomType type){
		this.roomId=roomId;
		this.name=name;
		this.type=type;
		this.devices=new ArrayList<>();
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(ArrayList<Device> devices) {
		this.devices = devices;
	}
	
	public void addDevice(Device d) {
		devices.add(d);
	}
}
