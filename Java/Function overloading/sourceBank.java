class Bank{
	void loan(int a,String b,double c){
		if(c >= 80)
			System.out.println("loan of Rs:-2,00,000 is approve for"+a+b);
		else if(c>=60)
			System.out.println("loan of Rs:-1,00,000 is approve for"+a+b);
		else if(c>=40)
			System.out.println("loan of Rs:-50,000 is approve for"+a+b);
		else 
			System.out.println("percentage is "+c+" below 40 so for "+ a + b+" is not approve for loan");

	}
	void loan(double c,int a,String b){
		if(c >= 12)
			System.out.println("loan of Rs:-7,00,000 is approve for"+a+b);
		else if(c>=10)
			System.out.println("loan of Rs:-6,00,000 is approve for"+a+b);
		else if(c>=6)
			System.out.println("loan of Rs:-5,00,000 is approve for"+a+b);
		else if(c>=4)
			System.out.println("loan of Rs:-4,00,000 is approve for"+a+b);
		else 
			System.out.println("LPA is "+c+" below 4 LPA so for "+a + b+" is not approve for loan");
}
}
class Student{
	public static void main(String args[]){
		int roll_no= 101;
		String name="Aniket";
		double percentage=10;

		Bank s1=new Bank();	
		s1.loan(roll_no,name,percentage);
}
}
class Employee{
	public static void main(String[] args){
		int id=1;
		String name ="Aniket";
		double annual_Salary=7;
		Bank e1=new Bank();
		e1.loan(annual_Salary,id,name);
}
}