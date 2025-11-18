package s;

abstract class Farmer {
	 int farmerId;
	    String farmerName;
	    double landArea;
	    String city;
	    double annualIncome;
	    int noOfEquipment;
	    double insuranceAmt;

	    Farmer(){
	        farmerId=0;
	        farmerName="Unknown";
	        landArea=0.0;
	        city="NotSet";
	        annualIncome=0.0;
	        noOfEquipment=0;
	        insuranceAmt=0.0;
	    }

	    Farmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,int noOfEquipment,double insuranceAmt){
	        this.farmerId=farmerId;
	        this.farmerName=farmerName;
	        this.landArea=landArea;
	        this.city=city;
	        this.annualIncome=annualIncome;
	        this.noOfEquipment=noOfEquipment;
	        this.insuranceAmt=insuranceAmt;
	    }

	    int getFarmerId(){
	        return farmerId;
	    }

	    void setFarmerId(int farmerId){
	        this.farmerId=farmerId;
	    }

	    String getFarmerName(){
	        return farmerName;
	    }

	    void setFarmerName(String farmerName){
	        this.farmerName=farmerName;
	    }

	    double getLandArea(){
	        return landArea;
	    }

	    void setLandArea(double landArea){
	        this.landArea=landArea;
	    }

	    String getCity(){
	        return city;
	    }

	    void setCity(String city){
	        this.city=city;
	    }

	    double getAnnualIncome(){
	        return annualIncome;
	    }

	    void setAnnualIncome(double annualIncome){
	        this.annualIncome=annualIncome;
	    }

	    int getNoOfEquipment(){
	        return noOfEquipment;
	    }

	    void setNoOfEquipment(int noOfEquipment){
	        this.noOfEquipment=noOfEquipment;
	    }

	    double getInsuranceAmt(){
	        return insuranceAmt;
	    }

	    void setInsuranceAmt(double insuranceAmt){
	        this.insuranceAmt=insuranceAmt;
	    }
	    public abstract String toString();
	    
	    void produce() {
	        System.out.println("Farmer produces agricultural goods.");
	    }
	}//superclass ends here

class DairyFarmer extends Farmer{
	    int noOfCattle;
	    double milkProducedPerDay;
	    int dairyLicenseNo;

	    DairyFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,int noOfEquipment,double insuranceAmt,
	                int noOfCattle,double milkProducedPerDay,int dairyLicenseNo){
	        super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
	        this.noOfCattle=noOfCattle;
	        this.milkProducedPerDay=milkProducedPerDay;
	        this.dairyLicenseNo=dairyLicenseNo;
	    }

	    int getNoOfCattle(){
	        return noOfCattle;
	    }

	    void setNoOfCattle(int noOfCattle){
	        this.noOfCattle=noOfCattle;
	    }

	    double getMilkProducedPerDay(){
	        return milkProducedPerDay;
	    }

	    void setMilkProducedPerDay(double milkProducedPerDay){
	        this.milkProducedPerDay=milkProducedPerDay;
	    }

	    int getDairyLicenseNo(){
	        return dairyLicenseNo;
	    }

	    void setDairyLicenseNo(int dairyLicenseNo){
	        this.dairyLicenseNo=dairyLicenseNo;
	    }
	    public String toString() {
	    	return "Farmer ID: " + this.farmerId + " Farmer Name: " + this.farmerName + " Land Area: " + this.landArea + " acres" + " City: " + this.city + " Annual Income: " + this.annualIncome + " Equipment: " + this.noOfEquipment + " Insurance Amount: " + this.insuranceAmt + " Cattle: " + this.noOfCattle + " Milk/Day: " + this.milkProducedPerDay + " L" + " Dairy License No: " + this.dairyLicenseNo;

	    }
	    void produce() {
	        System.out.println("Dairy Farmer produces milk daily.");
	    }
	}

class PoultryFarmer extends Farmer{
	    int noOfChickens;
	    int noOfSheds;
	    int noOfHens;
	    int eggsProducedPerDay;
	    int shedCapacity;
	    String poultryFarmName;

	    PoultryFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,int noOfEquipment,double insuranceAmt,
	                  int noOfChickens,int noOfHens,int noOfSheds,int eggsProducedPerDay,int shedCapacity,String poultryFarmName){
	        super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
	        this.noOfChickens=noOfChickens;
	        this.noOfHens=noOfHens;
	        this.noOfSheds=noOfSheds;
	        this.eggsProducedPerDay=eggsProducedPerDay;
	        this.shedCapacity=shedCapacity;
	        this.poultryFarmName=poultryFarmName;
	    }
	    public String toString() {
	    	return "Farmer ID: " + this.farmerId + " Farmer Name: " + this.farmerName + " Land Area: " + this.landArea + " acres" + " City: " + this.city + " Annual Income: " + this.annualIncome + " Equipment: " + this.noOfEquipment + " Insurance Amount: " + this.insuranceAmt + " Chickens: " + this.noOfChickens + " Hens: " + this.noOfHens + " Sheds: " + this.noOfSheds + " Eggs/Day: " + this.eggsProducedPerDay + " Shed Capacity: " + this.shedCapacity + " Poultry Farm: " + this.poultryFarmName;

	    }
	    void produce() {
	        System.out.println("Poultry Farmer produces eggs and chickens.");
	    }
	}//sub class ends here

class OrganicFarmer extends Farmer{
	    int organicCertId;
	    String cropType;
	    String fertilizerUsed;

	    OrganicFarmer(int farmerId,String farmerName,double landArea,String city,double annualIncome,int noOfEquipment,double insuranceAmt,
	                  int organicCertId,String cropType,String fertilizerUsed){
	        super(farmerId,farmerName,landArea,city,annualIncome,noOfEquipment,insuranceAmt);
	        this.organicCertId=organicCertId;
	        this.cropType=cropType;
	        this.fertilizerUsed=fertilizerUsed;
	    }

	    int getOrganicCertId(){
	        return organicCertId;
	    }

	    void setOrganicCertId(int organicCertId){
	        this.organicCertId=organicCertId;
	    }

	    String getCropType(){
	        return cropType;
	    }

	    void setCropType(String cropType){
	        this.cropType=cropType;
	    }

	    String getFertilizerUsed(){
	        return fertilizerUsed;
	    }

	    void setFertilizerUsed(String fertilizerUsed){
	        this.fertilizerUsed=fertilizerUsed;
	    }
	    public String toString() {
	    	return "Farmer ID: " + this.farmerId + " Farmer Name: " + this.farmerName + " Land Area: " + this.landArea + " acres" + " City: " + this.city + " Annual Income: " + this.annualIncome + " Equipment: " + this.noOfEquipment + " Insurance Amount: " + this.insuranceAmt + " Organic Cert ID: " + this.organicCertId + " Crop Type: " + this.cropType + " Fertilizer Used: " + this.fertilizerUsed;

	    }
	    void produce() {
	        System.out.println("Organic Farmer produces chemical-free organic crops.");
	    }
	}//sub class ends here

class testFarmer{
	    public static void main(String[] args){
	    	Farmer f1;
	        f1=new DairyFarmer(101,"Rohit",5.5,"Pune",450000,8,20000,15,120,9876);
	        System.out.println(f1);
	        f1.produce();
	        System.out.println();
	        f1=new PoultryFarmer(102,"Virat",3.0,"Shirdi",350000,6,15000,200,150,2,500,400,"FeatherNest");
	        System.out.println(f1);
	        f1.produce();
	        System.out.println();
	        f1=new OrganicFarmer(103,"Aniket",4.2,"Kolhapur",400000,7,18000,555,"Vegetables","Natural Compost");
	        System.out.println(f1);
	        f1.produce();
	        System.out.println();
	    }
	}
