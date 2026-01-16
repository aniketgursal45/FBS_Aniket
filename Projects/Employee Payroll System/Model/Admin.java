package Model;

public class Admin extends Employee{
	double allowance;
	
	public Admin(){
		super();
		this.allowance=1050.50;
	}
	
	public Admin(int id,String name,double salary,double allowance){
		super(id,name,salary);
		this.allowance=allowance;
	}
	void setAllowance(double a){
		this.allowance=a;
	}
	double getAllowance() {
		return allowance;
	}
	
	public double calsal() {
		return salary + allowance;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" Allowance:- "+this.allowance;
	}
}//admin sub class ends here
