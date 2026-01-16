package Model;

public abstract class SmartDevice implements Device{
	private String deviceId;
	private String name;
	private boolean isOn;
	private long lastStateChangeTime;
	
	
	public SmartDevice(String deviceId,String name) {
		this.deviceId=deviceId;
		this.name=name;
		this.isOn=false;
		this.lastStateChangeTime= System.currentTimeMillis();
	}
	
	
	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getLastStateChangeTime() {
		return lastStateChangeTime;
	}


	public void setLastStateChangeTime(long lastStateChangeTime) {
		this.lastStateChangeTime = lastStateChangeTime;
	}


	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}


	public void turnOn() {
		if(this.isOn==false) {
			this.isOn=true;
			this.lastStateChangeTime=System.currentTimeMillis();
		}
	}
	
	public void turnOff() {
		if(this.isOn==true) {
			this.isOn=false;
			this.lastStateChangeTime=System.currentTimeMillis();
		}
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public long getTimeInCurrentState() {
		return System.currentTimeMillis() - lastStateChangeTime;
	}
	public String getStatusDetails() {
		return "Device "+name+" is "+(isOn ? "ON" : "OFF");
	}
}