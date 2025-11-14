package s;

class Employee {
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
	void display() {
		System.out.println("Id is:- "+this.id);
		System.out.println("Name:- "+this.name);
		System.out.println("Salary:- "+this.salary);
	}

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
	
	void display() {
		super.display();
		System.out.println("commission:- "+this.commission);
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
	void display() {
		super.display();
		System.out.println("Allowance:- "+this.allowance);
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
	void display(){
		super.display();
		System.out.println("Incentive is:- "+this.incentive);
		System.out.println("Target is :- "+this.target);
	}
}//salesmanager subclass ends here

class prDemoInheritance{
	public static void main(String[] args) {
		Employee[] e1=new Employee[3];//general ref
		e1[0]=new Hr(103,"Rahul",30000,3000);//upcasting
		e1 [1]= new Admin(104,"MSD",7000,2500);
		e1[2]=new Salesmanager(105,"Surya",50000,2000,25000);
		
		for(int i=0;i<e1.length;i++) {
			e1[i].display();
			System.out.println(e1[i].calsal());
			System.out.println();
		}
	}
}


	
	



