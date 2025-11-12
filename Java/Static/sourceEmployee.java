import java.util.Scanner;
class Employee{
	String name;
	double basicSalary;
	static int companyBonusRate;

	static{
  		companyBonusRate=10;
	}
	
	Employee(){
		this.name="Rohit";
		this.basicSalary=30000;
	}
	
	Employee(String a,double b){
		this.name=a;
		this.basicSalary=b;
	}

	void setName(String a){
		this.name=a;
	}
	
	void setBasicSalary(double a){
		this.basicSalary=a;
	}
	void display(){
		System.out.println(this.name);
		System.out.println(this.basicSalary);
	}
	void calsal(){
		double sal = basicSalary +(basicSalary*companyBonusRate /100);
		System.out.println("Total salary of "+name+" is:- "+sal);
	}
	static void setCompanyBonusRate(int a){
		companyBonusRate=a;
	}
}
class testEmployee{
	public static void main(String[] args){
	Employee e1=new Employee();
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Your name:- ");
	String a=sc.nextLine();
	System.out.print("Enter Your basicSalary:- ");
	double b=sc.nextDouble();
	e1.setName(a);
	e1.setBasicSalary(b);
	Employee e2=new Employee();
	Employee e3=new Employee("Virat",40000);
	e1.display();
	e1.calsal();
	System.out.println();
	e2.display();
	e2.calsal();
	System.out.println();
	e3.display();
	e3.calsal();
	System.out.println("After companyBonusRate update ");
	Employee.setCompanyBonusRate(12);
	e1.display();
	e1.calsal();
	System.out.println();
	e2.display();
	e2.calsal();
	System.out.println();
	e3.display();
	e3.calsal();
}
}