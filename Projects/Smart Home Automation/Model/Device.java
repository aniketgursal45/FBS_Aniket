package Model;

public interface Device {
	void turnOn();
	void turnOff();
	boolean isOn();
	String getStatusDetails();
	long getTimeInCurrentState();
}
