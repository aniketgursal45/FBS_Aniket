import java.util.*;
class LibraryUser{
	String name;
	int dayLate;
	static double finePerDay;

	static{
		finePerDay =10;
	}
	LibraryUser(){
		this.name="Rohit";
		this.dayLate=5;
	}
	LibraryUser(String a,int b){
		this.name=a;
		this.dayLate=b;
	}
	void setName(String a){
		this.name=a;
	}
	void setDayLate(int b){
		this.dayLate=b;
	}
	void display(){
		System.out.println(this.name);
		System.out.println(this.dayLate);
	}
	void calculateFine(){
		double fine = dayLate * finePerDay;
		System.out.println("Total fine of "+name+" is :- "+ fine);
	}
}
class testLibraryUser{
	public static void main(String[] args){
		
		LibraryUser s1= new LibraryUser();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name:- ");
		String a = sc.nextLine();
		System.out.print("Enter day late:- ");
		int b = sc.nextInt();
		s1.setName(a);
		s1.setDayLate(b);
		LibraryUser s2= new LibraryUser();
		LibraryUser s3= new LibraryUser("Virat",7);
		s1.display();
		s1.calculateFine();
		System.out.println();
		s2.display();
		s2.calculateFine();
		System.out.println();
		s3.display();
		s3.calculateFine();
		
}
}