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
	void display(){
		super.display();
		System.out.println("Incentive is:- "+this.incentive);
		System.out.println("Target is :- "+this.target);
	}
}//salesmanager subclass ends here

class demoInheritance{
	public static void main(String[] args) {
		Employee e1 =new Employee();
		Employee e2 = new Employee(102,"Virat",18000);
		Hr h1=new Hr();
		Hr h2=new Hr(103,"Rahul",30000,3000);
		Admin a1 =new Admin();
		Admin a2 = new Admin(104,"MSD",7000,2500);
		Salesmanager s1=new Salesmanager();
		Salesmanager s2=new Salesmanager(105,"Surya",50000,2000,25000);
		System.out.println("Employee:- ");
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		System.out.println("HR:- ");
		h1.display();
		System.out.println();
		h2.display();
		System.out.println();
		System.out.println("Admin:- ");
		a1.display();
		System.out.println();
		a2.display();
		System.out.println("SalesManager:- ");
		System.out.println();
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();


	}
}


	
	

