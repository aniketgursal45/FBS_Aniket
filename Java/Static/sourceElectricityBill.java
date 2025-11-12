import java.util.Scanner;
class ElectricityBill{
	int id;
	String name;
	int unitsUsed;
	static int rate;
	
	static{
		rate=8;
	}
	
	ElectricityBill(){
		this.id=2;
		this.unitsUsed=22;
		this.name="Sarthak";
	}
	ElectricityBill(int a,String b,int c){
		this.id=a;
		this.name=b;
		this.unitsUsed=c;
	}
	void setId(int a){
		this.id=a;
	}
	void setName(String b){
		this.name=b;
	}
	void setUnitsUsed(int b){
		this.unitsUsed=b;
	}
	static void setRate(int a){
		rate=a;
	}
	void calbill(){
		int bill = rate * unitsUsed ;
		System.out.println("Bill is:-"+ bill);
	}
	void display(){
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.unitsUsed);
		
	}
}
class testElectricityBill{
	public static void main(String[] args){
		ElectricityBill e1=new ElectricityBill();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your ID:- ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Your Name:- ");
		String b = sc.nextLine();
		System.out.print("Enter units used:- ");
		int c = sc.nextInt();
		e1.setId(a);
		e1.setName(b);
		e1.setUnitsUsed(c);
		ElectricityBill.setRate(10);
		ElectricityBill e2=new ElectricityBill();
		ElectricityBill e3=new ElectricityBill(3,"Rohit",101);
		e1.display();
		e1.calbill();
		System.out.println();
		e2.display();
		e2.calbill();
		System.out.println();
		e3.display();
		e3.calbill();
		System.out.println();

}
}