package s;

abstract class Vehicle {
	String brand;
    String model;
    int year;
    String fuelType;
    double price;
    String brakeType;
    
    Vehicle(){
    	this.brand="Honda";
    	this.model="City";
    	this.year=2022;
    	this.fuelType="Petrol";
    	this.price=1200000;
    	this.brakeType="Disc";
    }
    Vehicle(String a,String b,int c,String d,double e,String f){
    	this.brand=a;
    	this.model=b;
    	this.year=c;
    	this.fuelType=d;
    	this.price=e;
    	this.brakeType=f;
    }
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	String getBrakeType() {
		return brakeType;
	}
	void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}
	public abstract String toString();
	 void brake() {
		 System.out.println("Brake applied");
	 }
    
}
class Car extends Vehicle{
	int noOfDoors;
	String transmission;
	
	Car(){
		super("Tata", "Nexon", 2023, "Petrol", 1500000, "Disc");
		noOfDoors = 4;
		transmission = "Manual";
	}
	 Car(String brand, String model, int year, String fuelType, double price, String brakeType,
		        int noOfDoors, String transmission) {

		        super(brand, model, year, fuelType, price, brakeType);
		        this.noOfDoors = noOfDoors;
		        this.transmission = transmission;
		    }
	int getNoOfDoors() {
		return noOfDoors;
	}
	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	String getTransmission() {
		return transmission;
	}
	void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String toString() {
		return "Brand: " + this.brand + " Model: " + this.model + " Year: " + this.year + " Fuel Type: " + this.fuelType + " Price: " + this.price + " Brake Type: " + this.brakeType + " Number of Doors: " + this.noOfDoors + " Transmission: " + this.transmission;
	}
	 void brake() {
		 System.out.println(this.brakeType+" Brake applied");
	 }
	 
}
class Bus extends Vehicle {
    int seatingCapacity;
    String busType;

    Bus() {
        super("Volvo", "9400", 2021, "Diesel", 8500000, "Air");
        seatingCapacity = 50;
        busType = "Sleeper";
    }

    Bus(String brand, String model, int year, String fuelType, double price, String brakeType,
        int seatingCapacity, String busType) {

        super(brand, model, year, fuelType, price, brakeType);
        this.seatingCapacity = seatingCapacity;
        this.busType = busType;
    }

    int getSeatingCapacity() {
        return seatingCapacity;
    }

    void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    String getBusType() {
        return busType;
    }

    void setBusType(String busType) {
        this.busType = busType;
    }

    public String toString() {
    	return "Brand: " + this.brand + " Model: " + this.model + " Year: " + this.year + " Fuel Type: " + this.fuelType + " Price: " + this.price + " Brake Type: " + this.brakeType + " Seating Capacity: " + this.seatingCapacity + " Bus Type: " + this.busType;
    }
	 void brake() {
		 System.out.println(this.brakeType+" Brake applied");
	 }
}
class Bike extends Vehicle {
    int engineCC;
    boolean hasABS;

    Bike() {
        super("Yamaha", "R15", 2024, "Petrol", 180000, "Disc");
        engineCC = 155;
        hasABS = true;
    }

    Bike(String brand, String model, int year, String fuelType, double price, String brakeType,
         int engineCC, boolean hasABS) {

        super(brand, model, year, fuelType, price, brakeType);
        this.engineCC = engineCC;
        this.hasABS = hasABS;
    }

    int getEngineCC() {
        return engineCC;
    }

    void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    boolean getHasABS() {
        return hasABS;
    }

    void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }
    public String toString() {
    	return "Brand: " + this.brand + " Model: " + this.model + " Year: " + this.year + " Fuel Type: " + this.fuelType + " Price: " + this.price + " Brake Type: " + this.brakeType + " Engine CC: " + this.engineCC + " Has ABS: " + this.hasABS;
    }
	 void brake() {
		 System.out.println(this.brakeType+" Brake applied");
	 }
}
class testVehicle{
	public static void main(String[] args) {
		Vehicle v1;
		System.out.println("Car");
		v1=new Car("Honda", "City", 2022, "Petrol", 1200000, "Drum", 4, "Automatic");
		System.out.println(v1);
		v1.brake();
		System.out.println();
		System.out.println("Bus");
		v1=new Bus("Volvo", "9700", 2021, "Diesel", 9000000, "Air", 55, "AC Sleeper");
		System.out.println(v1);
		v1.brake();
		System.out.println();
		System.out.println("Bike");
		v1=new Bike("Yamaha", "MT15", 2024, "Petrol", 175000, "Disc", 155, true);
		System.out.println(v1);
		v1.brake();
	}
}
