package s;

import java.util.Scanner;
abstract class ElectricityBill {
	int units;
	String customerName;
	double amount=0;
	
	ElectricityBill(){
		this.units=0;
		this.customerName="Unknown";
	}
	ElectricityBill(int a,String b){
		this.units=a;
		this.customerName=b;
	}
	int getUnits() {
		return units;
	}
	void setUnits(int units) {
		this.units = units;
	}
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	void showUsage() {
		System.out.println(this.units);
		System.out.println(this.customerName);
	}
	abstract double calculateBill();
	
	final void generateBill() {
		this.calculateBill();
		this.amount=amount +(amount * 0.05);
		this.amount=this.amount +50;
		System.out.println("Units:- "+this.units+" Customer Name:- "+this.customerName+" Total bill:- "+this.amount);
	}
}//abstract superclass ends here

class ResidentialBill extends ElectricityBill{
	
	ResidentialBill(){
		super();
	}
	ResidentialBill(int a ,String b){
		super(a,b);
	}
	double calculateBill() {
		if(this.units>=0 && this.units<=100) {
			this.amount=this.units * 2.5;
		}else if(this.units>100 && this.units<=300) {
			this.amount=this.units *3.5;
		}else if(this.units>300) {
			this.amount=this.units *5;
		}
		if(this.units>500) {
			this.amount=this.amount+150;
		}
		return this.amount;
	}
}//sub class ends here
class CommercialBill extends ElectricityBill{
	CommercialBill(){
		super();
	}
	CommercialBill(int a ,String b){
		super(a,b);
	}
	double calculateBill() {
		if(this.units<200) {
			this.amount=this.units *6.5;
			if(this.amount<=1500) {
				this.amount=1500;
			}
		}else if(this.units>=200 && this.units<=1000) {
			this.amount = this.units *6.5;
		}
		else if(this.units>1000) {
			this.amount=this.units*6.5;
			this.amount=this.amount +(this.amount * 0.08);
		}
		return this.amount;
	}
	
}//sub class ends here
class testElectricityBill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("customer type ( 1 for:- Residential /2 for:-  Commercial / 3 to exit):- ");
		int type = sc.nextInt();
		while(type != 3) {
			ElectricityBill e1;
			System.out.print("Enter customer name:- ");
			sc.nextLine();
			String a=sc.nextLine();
			System.out.print("units consumed:- ");
			int b = sc.nextInt();
			if(type==1) {
				e1=new ResidentialBill(b,a); 
				e1.generateBill();
			}else if(type ==2) {
				e1=new CommercialBill(b,a); 
				e1.generateBill();
			}
			System.out.println();
			System.out.print("customer type ( 1 for:- Residential /2 for:-  Commercial / 3 to exit):- ");
			type=sc.nextInt();
		}
	}
}