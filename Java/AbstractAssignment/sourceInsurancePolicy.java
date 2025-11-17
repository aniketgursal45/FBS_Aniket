package s;
import java.util.Scanner;
abstract class InsurancePolicy {
	String policyHolderName;
	double basePremium;
	
	InsurancePolicy(){
		this.policyHolderName="UNKNOWN";
		this.basePremium=0.0;
	}
	InsurancePolicy(String name,double money){
		this.policyHolderName=name;
		this.basePremium=money;
	}
	String getPolicyHolderName() {
		return policyHolderName;
	}
	void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	double getBasePremium() {
		return basePremium;
	}
	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
	
	abstract double calculatePremium();
	
	void printPolicyDetails() {
		System.out.println("Policy holder name:- "+this.policyHolderName);
		System.out.println("Base premium:- "+this.basePremium);
		System.out.println("Final premium:- "+calculatePremium());
	}
}//abstract superclass ends here

class CarInsurance extends InsurancePolicy{
	
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;
	
	CarInsurance(){
		super();
		this.carAgeInYears=0;
		this.hadAccidentInLastYear=false;
		this.carValue=0.0;
	}
	CarInsurance(String a,double b,int c,boolean d,double e){
		super(a,b);
		this.carAgeInYears=c;
		this.hadAccidentInLastYear=d;
		this.carValue=e;
	}
	int getCarAgeInYears() {
		return carAgeInYears;
	}
	void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}
	boolean isHadAccidentInLastYear() {
		return hadAccidentInLastYear;
	}
	void setHadAccidentInLastYear(boolean hadAccidentInLastYear) {
		this.hadAccidentInLastYear = hadAccidentInLastYear;
	}
	double getCarValue() {
		return carValue;
	}
	void setCarValue(double carValue) {
		this.carValue = carValue;
	}
	
	double calculatePremium() {
		double premium=this.basePremium;
		if(this.carAgeInYears<=3) {
			premium = premium +(premium *0.10);
		}else if(this.carAgeInYears>=4 && this.carAgeInYears<=7) {
			premium = premium +(premium *0.20);
		}else if(this.carAgeInYears>7) {
			premium = premium +(premium *0.30);
		}
		
		if(this.hadAccidentInLastYear==true) {
			premium = premium +(premium *0.25);
		}else if(this.hadAccidentInLastYear==false) {
			premium = premium -(premium *0.10);
		}
		
		if(this.carValue>1000000) {
			premium = premium +2000;
		}
		
		return premium;
	}

}//sub class ends here

class HealthInsurance extends InsurancePolicy{
	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;

	HealthInsurance(){
		this.age=0;
		this.isSmoker=false;
		this.hasPreExistingDisease=false;
	}
	HealthInsurance(String a,double b,int c,boolean d,boolean e){
		super(a,b);
		this.age=c;
		this.isSmoker=d;
		this.hasPreExistingDisease=e;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	boolean isSmoker() {
		return isSmoker;
	}
	void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}
	void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}
	
	double calculatePremium() {
		double premium=this.basePremium;
		if(this.age<30) {
			premium = premium +(premium *0.10);
		}else if(this.age>=30 && this.age<=45) {
			premium=premium +(premium *0.25);
		}else if(this.age>45) {
			premium=premium +(premium *0.40);
		}
		
		if(this.isSmoker==true) {
			premium=premium +(premium *0.30);
		}else if(this.isSmoker==false) {
			premium=premium -(premium *0.05);
		}
		if(this.hasPreExistingDisease==true) {
			premium=premium +(premium *0.20);
		}
		return premium;
	}
}//sub class ends here
class testInsurancePolicy{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=4;
		while(num!=3) {
		System.out.print("Enter (1) for Car Insurance .(2) for Health Insurance .(3) for Exit:- ");
		num = sc.nextInt();
		InsurancePolicy i1;
		if(num==1) {
			sc.nextLine();
			System.out.print("Enter Policy Holder Name:- ");
			String name = sc.nextLine();
			System.out.print("Enter basePremium:- ");
			double premium = sc.nextDouble();
			System.out.print("Enter car Age In Years:- ");
			int age=sc.nextInt();
			System.out.print("had Accident In LastYear:- ");
			boolean acc=sc.nextBoolean();
			System.out.print("car Value:- ");
			double v=sc.nextDouble();
			i1=new  CarInsurance(name,premium,age,acc,v);
			i1.printPolicyDetails();
		}else if(num == 2) {
			sc.nextLine();
			System.out.print("Enter Policy Holder Name:- ");
			String name = sc.nextLine();
			System.out.print("Enter basePremium:- ");
			double premium = sc.nextDouble();
			System.out.print("Enter Age:- ");
			int a=sc.nextInt();
			System.out.print("Enter is Smoker:- ");
			boolean b=sc.nextBoolean();
			System.out.print("Enter has Pre Existing Disease:- ");
			boolean c=sc.nextBoolean();
			i1=new HealthInsurance(name,premium,a,b,c);
			i1.printPolicyDetails();
		}
		}
	}
}
