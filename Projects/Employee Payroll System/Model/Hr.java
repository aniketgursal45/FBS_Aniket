package Model;

public class Hr extends Employee{
	double commission;
	
	public Hr(){
		super();
		this.commission=2000;
	}
	public Hr(int id,String name,double salary,double commission){
		super(id,name,salary);
		this.commission=commission;
	}
	void setCommission(double a) {
		this.commission=a;
	}
	double getCommission() {
		return commission;
	}
	
	public double calsal() {
		return salary + commission;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" commission:- "+this.commission;
	}
}//Hr subclass ends here.
