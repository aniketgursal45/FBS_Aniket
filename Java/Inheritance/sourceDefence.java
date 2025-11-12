class Defence {
	String nameOfHead,countryName,locationOfHeadquarters;
	int noOfTroops,noOfDept,noOfVehicles,manpowerCount,noOfBases,noOfCasualties,noOfMissionsPerformed;
	long budget;

	Defence(){
		this.nameOfHead="General Arjun Singh";
		this.countryName="India";
		this.locationOfHeadquarters="New Delhi";
		this.noOfTroops=15000;
		this.noOfDept=5;
		this.noOfVehicles=12000;
		this.manpowerCount=200000;
		this.noOfBases=25;
		this.noOfCasualties=300;
		this.noOfMissionsPerformed=120;
		this.budget=5000000000l;
	}
	Defence(String a,String b,String c,int d,int e,int f,int g,int h,int i,int j,long z){
		this.nameOfHead=a;
		this.countryName=b;
		this.locationOfHeadquarters=c;
		this.noOfTroops=d;
		this.noOfDept=e;
		this.noOfVehicles=f;
		this.manpowerCount=g;
		this.noOfBases=h;
		this.noOfCasualties=i;
		this.noOfMissionsPerformed=j;
		this.budget=z;
	}
	String getNameOfHead() {
		return nameOfHead;
	}
	void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}
	String getCountryName() {
		return countryName;
	}
	void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	String getLocationOfHeadquarters() {
		return locationOfHeadquarters;
	}
	void setLocationOfHeadquarters(String locationOfHeadquarters) {
		this.locationOfHeadquarters = locationOfHeadquarters;
	}
	int getNoOfTroops() {
		return noOfTroops;
	}
	void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}
	int getNoOfDept() {
		return noOfDept;
	}
	void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}
	int getNoOfVehicles() {
		return noOfVehicles;
	}
	void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	int getManpowerCount() {
		return manpowerCount;
	}
	void setManpowerCount(int manpowerCount) {
		this.manpowerCount = manpowerCount;
	}
	int getNoOfBases() {
		return noOfBases;
	}
	void setNoOfBases(int noOfBases) {
		this.noOfBases = noOfBases;
	}
	int getNoOfCasualties() {
		return noOfCasualties;
	}
	void setNoOfCasualties(int noOfCasualties) {
		this.noOfCasualties = noOfCasualties;
	}
	int getNoOfMissionsPerformed() {
		return noOfMissionsPerformed;
	}
	void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
		this.noOfMissionsPerformed = noOfMissionsPerformed;
	}
	long getBudget() {
		return budget;
	}
	void setBudget(long budget) {
		this.budget = budget;
	}
	void display(){
		System.out.println("Name of head :- "+this.nameOfHead);
		System.out.println("Name of country:- "+this.countryName);
		System.out.println("Name of location of headquarters:- "+this.locationOfHeadquarters);
		System.out.println("No of troops:- "+this.noOfTroops);
		System.out.println("No of dept:- "+this.noOfDept);
		System.out.println("No of vehicle:- "+this.noOfVehicles);
		System.out.println("No of manpower:- "+this.manpowerCount);
		System.out.println("No of base:- "+this.noOfBases);
		System.out.println("No of casualaties:- "+this.noOfCasualties);
		System.out.println("No of mission performed:- "+this.noOfMissionsPerformed);
		System.out.println("Budget is:- "+this.budget);
	}
	
} // Defence super class ends here
class Army extends Defence{
	int noOfTanks,noOfGuns,noOfRegiments,noOfBattalions;
	
	Army(){
		super();
		this.noOfTanks=3500;
		this.noOfGuns=8000;
		this.noOfRegiments=50;
		this.noOfBattalions=200;
	}
	Army(String nameOfHead,String countryName,String locationOfHeadquarters,int noOfTroops,int noOfDept,int noOfVehicles,int manpowerCount,int noOfBases,int noOfCasualties,int noOfMissionsPerformed,long budget,int a,int b,int c,int d){
		super(nameOfHead,countryName,locationOfHeadquarters,noOfTroops,noOfDept,noOfVehicles,manpowerCount,noOfBases,noOfCasualties,noOfMissionsPerformed,budget);
		this.noOfTanks=3500;
		this.noOfGuns=8000;
		this.noOfRegiments=50;
		this.noOfBattalions=200;
	}
	int getNoOfTanks() {
		return noOfTanks;
	}
	void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}
	int getNoOfGuns() {
		return noOfGuns;
	}
	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}
	int getNoOfRegiments() {
		return noOfRegiments;
	}
	void setNoOfRegiments(int noOfRegiments) {
		this.noOfRegiments = noOfRegiments;
	}
	int getNoOfBattalions() {
		return noOfBattalions;
	}
	void setNoOfBattalions(int noOfBattalions) {
		this.noOfBattalions = noOfBattalions;
	}
	
	void display() {
		super.display();
		System.out.println("No of tanks:- "+this.noOfTanks);
		System.out.println("No of Guns:- "+this.noOfTanks);
		System.out.println("No of Regiments:- "+this.noOfRegiments);
		System.out.println("No of Battalions:- "+this.noOfBattalions);
	}
}//Army subclss ends here

class Navy extends Defence{
	int noOfShips,noOfSubmarines,noOfTorpedoes;
	
	Navy(){
		super();
		this.noOfShips=120;
		this.noOfSubmarines=20;
		this.noOfTorpedoes=300;
	}
	Navy(String nameOfHead,String countryName,String locationOfHeadquarters,int noOfTroops,int noOfDept,int noOfVehicles,int manpowerCount,int noOfBases,int noOfCasualties,int noOfMissionsPerformed,long budget,int a,int b,int c){
		super(nameOfHead,countryName,locationOfHeadquarters,noOfTroops,noOfDept,noOfVehicles,manpowerCount,noOfBases,noOfCasualties,noOfMissionsPerformed,budget);
		this.noOfShips=a;
		this.noOfSubmarines=b;
		this.noOfTorpedoes=c;
	}
	int getNoOfShips() {
		return noOfShips;
	}
	void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}
	int getNoOfSubmarines() {
		return noOfSubmarines;
	}
	void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}
	int getNoOfTorpedoes() {
		return noOfTorpedoes;
	}
	void setNoOfTorpedoes(int noOfTorpedoes) {
		this.noOfTorpedoes = noOfTorpedoes;
	}
	void display() {
		super.display();
		System.out.println("No of Ships:- "+this.noOfShips);
		System.out.println("No of submarines:- "+this.noOfSubmarines);
		System.out.println("No of torpedoes:- "+this.noOfTorpedoes);
	}
}//Navy subclass ends here

class Air extends Defence{
	int noOfMissiles,aircraft,noOfSquadrons;
	
	Air(){
		super();
		this.noOfMissiles=1000;
		this.aircraft=250;
		this.noOfSquadrons=15;
	}
	Air(String nameOfHead,String countryName,String locationOfHeadquarters,int noOfTroops,int noOfDept,int noOfVehicles,int manpowerCount,int noOfBases,int noOfCasualties,int noOfMissionsPerformed,long budget,int a,int b,int c){
		super(nameOfHead,countryName,locationOfHeadquarters,noOfTroops,noOfDept,noOfVehicles,manpowerCount,noOfBases,noOfCasualties,noOfMissionsPerformed,budget);
		this.noOfMissiles=a;
		this.aircraft=b;
		this.noOfSquadrons=c;
	}
	void display() {
		super.display();
		System.out.println("No of missiles:- "+this.noOfMissiles);
		System.out.println("No of aircraft:- "+this.aircraft);
		System.out.println("No of squadrons:- "+this.noOfSquadrons);
	}
}//navy sub class ends here

class testDefence{
	public static void main(String[] args) {
		Defence d1=new Defence();
		Defence d2 = new Defence("General Vikram Rao","USA","Washington DC",180000,6,15000,250000,30,250,140,6000000000L);
		Army a1=new Army();
		Army a2=new Army("General Karan Mehta","India","Pune",160000,4,10000,220000,28,280,130,5500000000L,4000,8500,55,210);
		Navy n1=new Navy();
		Navy n2=new Navy("Admiral Rajesh Menon","India","Mumbai",90000,3,8000,150000,20,200,110,4500000000L,130,25,350);
		Air r1=new Air();
		Air r2=new Air("Air Marshal Dev Sharma","India","Bangalore",120000,4,9000,180000,22,230,115,4800000000L,1200,270,18);
		
		System.out.println("Defence");
		System.out.println();
		d1.display();
		System.out.println();
		d2.display();
		System.out.println();
		System.out.println("Army");
		System.out.println();
		a1.display();
		System.out.println();
		a2.display();
		System.out.println();
		System.out.println("Navy");
		System.out.println();
		n1.display();
		System.out.println();
		n2.display();
		System.out.println();
		System.out.println("Air");
		System.out.println();
		r1.display();
		System.out.println();
		r2.display();
		System.out.println();
	}
}

