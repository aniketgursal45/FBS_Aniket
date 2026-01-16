package Model;

public class AirConditioner extends SmartDevice {
	private int targetTemperature;
	
	public AirConditioner(String deviceId,String name,int targetTemperature) {
		super(deviceId,name);
		this.targetTemperature=targetTemperature;
	}

	public int getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(int targetTemperature) {
		this.targetTemperature = targetTemperature;
	}
}
