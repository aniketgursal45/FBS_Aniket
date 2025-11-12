package defence;

class Farmer {
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

	    void display(){
	        System.out.println("Farmer ID: "+farmerId);
	        System.out.println("Farmer Name: "+farmerName);
	        System.out.println("Land Area: "+landArea+" acres");
	        System.out.println("City: "+city);
	        System.out.println("Annual Income: "+annualIncome);
	        System.out.println("No. of Equipment: "+noOfEquipment);
	        System.out.println("Insurance Amount: "+insuranceAmt);
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

	    void display(){
	        super.display();
	        System.out.println("No. of Cattle: "+noOfCattle);
	        System.out.println("Milk Produced/Day: "+milkProducedPerDay+" L");
	        System.out.println("Dairy License No: "+dairyLicenseNo);
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

	    void display(){
	        super.display();
	        System.out.println("No. of Chickens: "+noOfChickens);
	        System.out.println("No. of Hens: "+noOfHens);
	        System.out.println("No. of Sheds: "+noOfSheds);
	        System.out.println("Eggs Produced/Day: "+eggsProducedPerDay);
	        System.out.println("Shed Capacity: "+shedCapacity);
	        System.out.println("Poultry Farm Name: "+poultryFarmName);
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

	    void display(){
	        super.display();
	        System.out.println("Organic Cert ID: "+organicCertId);
	        System.out.println("Crop Type: "+cropType);
	        System.out.println("Fertilizer Used: "+fertilizerUsed);
	    }
	}//sub class ends here

class testFarmer{
	    public static void main(String[] args){
	        DairyFarmer df=new DairyFarmer(101,"Rohit",5.5,"Pune",450000,8,20000,15,120,9876);
	        PoultryFarmer pf=new PoultryFarmer(102,"Virat",3.0,"Shirdi",350000,6,15000,200,150,2,500,400,"FeatherNest");
	        OrganicFarmer of=new OrganicFarmer(103,"Aniket",4.2,"Kolhapur",400000,7,18000,555,"Vegetables","Natural Compost");

	        df.display();
	        System.out.println();
	        pf.display();
	        System.out.println();
	        of.display();
	    }
	}