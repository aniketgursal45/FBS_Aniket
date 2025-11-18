package s;

abstract class MusicInstrument {
    String instrumentName;
    String type;
    String material;
    String brand;
    double price;

    MusicInstrument() {
        super();
        this.instrumentName = "Generic Instrument";
        this.type = "Unknown";
        this.material = "Wood";
        this.brand = "Generic Brand";
        this.price = 1500.0;
    }

    MusicInstrument(String instrumentName, String type, String material, String brand, double price) {
        super();
        this.instrumentName = instrumentName;
        this.type = type;
        this.material = material;
        this.brand = brand;
        this.price = price;
    }

    String getInstrumentName() {
        return instrumentName;
    }
    void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    String getType() {
        return type;
    }
    void setType(String type) {
        this.type = type;
    }

    String getMaterial() {
        return material;
    }
    void setMaterial(String material) {
        this.material = material;
    }

    String getBrand() {
        return brand;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }
    public abstract String toString();

    void play() {
        System.out.println("Instrument is playing...");
    }
}
class Guitar extends MusicInstrument {
    int noOfStrings;
    String guitarType;   // Acoustic, Electric

    Guitar() {
        super();
        this.noOfStrings = 6;
        this.guitarType = "Acoustic";
    }

    Guitar(String instrumentName, String type, String material, String brand, double price,
           int noOfStrings, String guitarType) {

        super(instrumentName, type, material, brand, price);
        this.noOfStrings = noOfStrings;
        this.guitarType = guitarType;
    }

    int getNoOfStrings() {
        return noOfStrings;
    }

    void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    String getGuitarType() {
        return guitarType;
    }

    void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }
    public String toString() {
    	return "Instrument Name: " + this.instrumentName + " Type: " + this.type + " Material: " + this.material + " Brand: " + this.brand + " Price: " + this.price + " No. of Strings: " + this.noOfStrings + " Guitar Type: " + this.guitarType;
    }
    void play() {
        System.out.println("Guitar is playing: Tannnn Tannnn 🎸");
    }
}
class Tabla extends MusicInstrument {
    double dayanDiameter;
    double bayanDiameter;
    String skinMaterial;

    Tabla() {
        super();
        this.dayanDiameter = 8.0;
        this.bayanDiameter = 10.0;
        this.skinMaterial = "Goat Skin";
    }

    Tabla(String instrumentName, String type, String material, String brand, double price,
          double dayanDiameter, double bayanDiameter, String skinMaterial) {

        super(instrumentName, type, material, brand, price);
        this.dayanDiameter = dayanDiameter;
        this.bayanDiameter = bayanDiameter;
        this.skinMaterial = skinMaterial;
    }

    double getDayanDiameter() {
        return dayanDiameter;
    }

    void setDayanDiameter(double dayanDiameter) {
        this.dayanDiameter = dayanDiameter;
    }

    double getBayanDiameter() {
        return bayanDiameter;
    }

    void setBayanDiameter(double bayanDiameter) {
        this.bayanDiameter = bayanDiameter;
    }

    String getSkinMaterial() {
        return skinMaterial;
    }

    void setSkinMaterial(String skinMaterial) {
        this.skinMaterial = skinMaterial;
    }

    public String toString() {
    	return "Instrument Name: " + this.instrumentName + " Type: " + this.type + " Material: " + this.material + " Brand: " + this.brand + " Price: " + this.price + " Dayan Diameter: " + this.dayanDiameter + " Bayan Diameter: " + this.bayanDiameter + " Skin Material: " + this.skinMaterial;

    }
    void play() {
        System.out.println("Tabla is playing: Dhum Tak Tak 🪘");
    }
}
class testMusicInstrument {
    public static void main(String[] args) {
    	MusicInstrument  m1;
        m1= new Guitar("Guitar", "String", "Wood", "Yamaha", 7500, 6, "Electric");
        System.out.println("Guitar");
        System.out.println();
        System.out.println(m1);
        m1.play();
        System.out.println();
        m1= new Tabla("Tabla", "Percussion", "Wood", "Bina", 6500, 8.5, 10.5, "Synthetic");
        System.out.println("Tabla");
        System.out.println();
        System.out.println(m1);
        m1.play();
    }
}

