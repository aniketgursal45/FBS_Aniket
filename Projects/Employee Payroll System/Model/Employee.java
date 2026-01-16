package Model;

public abstract class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(){
		this.id=101;
		this.name="Aniket";
		this.salary=40000;
	}
	
	public Employee(int id,String name,double salary){
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
	public void setSalary(double a) {
		this.salary=a;
	}
	public int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public abstract double calsal();
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)obj;
		if(this.id==e1.id) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "\nId:- "+this.id+"\nName:- "+this.name+"\nSalary:- "+this.salary;
	}

}//Employee superclass ends here
