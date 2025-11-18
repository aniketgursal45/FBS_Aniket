package s;

abstract class Employee {
	int id;
	String name;
	double salary;
	
	Employee(){
		this.id=101;
		this.name="Aniket";
		this.salary=40000;
	}
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void setId(int a) {
		this.id=a;
	}
	void setName(String a) {
		this.name=a;
	}
	void setSalary(double a) {
		this.salary=a;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	double getSalary() {
		return salary;
	}
	
	double calsal() {
		return salary;
	}
	public abstract String toString();

}//Employee superclass ends here

class Hr extends Employee{
	double commission;
	
	Hr(){
		super();
		this.commission=2000;
	}
	Hr(int id,String name,double salary,double commission){
		super(id,name,salary);
		this.commission=commission;
	}
	void setCommission(double a) {
		this.commission=a;
	}
	double getCommission() {
		return commission;
	}
	
	double calsal() {
		return salary + commission;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" commission:- "+this.commission;
	}
}//Hr subclass ends here.

class Admin extends Employee{
	double allowance;
	
	Admin(){
		super();
		this.allowance=1050.50;
	}
	
	Admin(int id,String name,double salary,double allowance){
		super(id,name,salary);
		this.allowance=allowance;
	}
	void setAllowance(double a){
		this.allowance=a;
	}
	double getAllowance() {
		return allowance;
	}
	
	double calsal() {
		return salary + allowance;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" Allowance:- "+this.allowance;
	}
}//admin sub class ends here

class Salesmanager extends Employee{
	double incentive,target;

	Salesmanager(){
		super();
		this.incentive=1050.50;
		this.target =10000;
	}
	
	Salesmanager(int id,String name,double salary,double d,double e){
		super(id,name,salary);
		this.incentive=d;
		this.target=e;
	}
	void setIncentive(double a){
		this.incentive=a;
	}
	void setTarget(double a){
		this.target=a;
	}
	double getIncentive() {
		return incentive;
	}
	double getTarget() {
		return target;
	}
	
	double calsal() {
		return salary + incentive;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" Incentive is:- "+this.incentive+" Target is :- "+this.target;
	}
}//salesmanager subclass ends here

class prDemoInheritance{
	public static void main(String[] args) {
		
		Employee e1;//general ref
		e1=new Hr(103,"Rahul",30000,3000);//upcasting
		System.out.println(e1);
		System.out.println(e1.calsal());
		System.out.println();
		e1= new Admin(104,"MSD",7000,2500);
		System.out.println(e1);
		System.out.println(e1.calsal());
		System.out.println();
		e1=new Salesmanager(105,"Surya",50000,2000,25000);
		System.out.println(e1);
		System.out.println(e1.calsal());
		System.out.println();	
		
	}
}


	
	




