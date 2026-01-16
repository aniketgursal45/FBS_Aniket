package Model;

public class Salesmanager extends Employee{
	double incentive,target;

	public Salesmanager(){
		super();
		this.incentive=1050.50;
		this.target =10000;
	}
	
	public Salesmanager(int id,String name,double salary,double d,double e){
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
	
	public double calsal() {
		return salary + incentive;
	}
	
	public String toString() {
		return "Id:- "+this.id+" Name:- "+this.name+" Salary:- "+this.salary+" Incentive is:- "+this.incentive+" Target is :- "+this.target;
	}
}//salesmanager subclass ends here