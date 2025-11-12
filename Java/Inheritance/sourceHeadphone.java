class Headphone {
	String brand,color,soundQuality;
	int price;
	
	Headphone(){
		super();
		this.brand="Sony";
		this.color="Red";
		this.soundQuality="High Bass";
		this.price=2500;
	}
	Headphone(String a,String b,String c,int d){
		super();
		this.brand=a;
		this.color=b;
		this.soundQuality=c;
		this.price=d;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getSoundQuality() {
		return soundQuality;
	}
	void setSoundQuality(String soundQuality) {
		this.soundQuality = soundQuality;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	void display(){
		System.out.println("Brand name:- "+this.brand);
		System.out.println("Color Name:- "+this.color);
		System.out.println("Sound quality:- "+this.soundQuality);
		System.out.println("Price is:- "+this.price);
	}
	
}//Headphone super class ends here

class WiredHeadphone extends Headphone{
	double wireLength;
	String connectorType;
	boolean hasMic;
	
	WiredHeadphone(){
		super();
		this.wireLength=1.5;
		this.connectorType="3.5mm Jack";
		this.hasMic=true;
	}
	WiredHeadphone(String brand,String color,String soundQuality,int price,double a,String b,boolean c){
		super(brand,color,soundQuality,price);
		this.wireLength=a;
		this.connectorType=b;
		this.hasMic=c;
	}
	double getWireLength() {
		return wireLength;
	}
	void setWireLength(double wireLength) {
		this.wireLength = wireLength;
	}
	String getConnectorType() {
		return connectorType;
	}
	void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}
	boolean isHasMic() {
		return hasMic;
	}
	void setHasMic(boolean hasMic) {
		this.hasMic = hasMic;
	}
	
	void display(){
		super.display();
		System.out.println("Wire length:- "+this.wireLength);
		System.out.println("Connector Type:- "+this.connectorType);
		System.out.println("Has Mic:- "+this.hasMic);
	}
	
}//Wiredheadphone class ends here

class WirelessHeadphone extends Headphone{
	int batteryLife,chargingTime;
	String bluetoothVersion;
	
	WirelessHeadphone(){
		super();
		this.batteryLife=20;
		this.chargingTime=2;
		this.bluetoothVersion="5.3";
	}
	WirelessHeadphone(String brand,String color,String soundQuality,int price,int a,int b,String c){
		super(brand,color,soundQuality,price);
		this.batteryLife=a;
		this.chargingTime=b;
		this.bluetoothVersion=c;
	}
	int getBatteryLife() {
		return batteryLife;
	}
	void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	int getChargingTime() {
		return chargingTime;
	}
	void setChargingTime(int chargingTime) {
		this.chargingTime = chargingTime;
	}
	String getBluetoothVersion() {
		return bluetoothVersion;
	}
	void setBluetoothVersion(String bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}
	void display(){
		super.display();
		System.out.println("Battery life:- "+this.batteryLife);
		System.out.println("Charging time:- "+this.chargingTime);
		System.out.println("Bluetooth version:- "+this.bluetoothVersion);
	}
	
}//wireless sub class ends here

class testHeadphone{
	public static void main(String[] args) {
		 WiredHeadphone a1=new  WiredHeadphone();
		 WiredHeadphone a2=new WiredHeadphone("JBL","Red","Clear Sound",2499,1.2,"Type-C Jack",false);
		 WirelessHeadphone b1=new WirelessHeadphone();
		 WirelessHeadphone b2=new WirelessHeadphone("Boat","Blue","Extra Bass",3999,25,2,"5.2");
		 
		 System.out.println("WiredHeadphone");
			System.out.println();
			a1.display();
			System.out.println();
			a2.display();
			System.out.println();
			System.out.println("WirelessHeadphone");
			System.out.println();
			b1.display();
			System.out.println();
			b2.display();
			System.out.println();
	}
}

