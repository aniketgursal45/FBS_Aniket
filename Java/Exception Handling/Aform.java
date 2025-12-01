package sj;

class AdmissionForm {
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	AdmissionForm(String sn,int age,double p,double cf,double fd){
		this.studentName=sn;
		this.age=age;
		this.percentage=p;
		this.courseFees=cf;
		this.feesPaid=fd;
	}
	
	
	void validateForm() throws EmptyNameException, UnderageException, InvalidPercentageException,
    NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException{
		if(this.studentName==null|| studentName.trim().isEmpty() ) {
			throw new EmptyNameException();
			
		}
		if(this.age<17) {
			throw new UnderageException();
		}
		if(this.percentage< 0 || this.percentage> 100) {
			throw new InvalidPercentageException();
		}
		if(this.percentage< 35) {
			throw new NotFitForAdmissionException();
		}
		if(this.feesPaid==0) {
			throw new FeesNotPaidException();
		}
		int percentpaid =(int)((this.feesPaid / this.courseFees) * 100);
		
		if( percentpaid<30) {
			throw new InsufficientFeesException();
		}
			System.out.println("Admission confirm! ");
		
	}
public String toString() {
	return " Student Name:- "+this.studentName+"\n Age:- "+this.age+"\n Percentage:- "+this.percentage+"\n Course Fees:- "+this.courseFees+"\n Fees paid:- "+this.feesPaid;
}
	
	
}
class EmptyNameException extends Exception{
	public String toString() {
		return "Enter a proper name dont give blank or spaces";
	}
}
class UnderageException extends Exception{
	public String toString() {
		return "Enter age 17  above";
	}
}
class InvalidPercentageException extends Exception{
	public String toString() {
		return "Put percentage in 0 to 100 only";
	}
}
class NotFitForAdmissionException extends Exception{
	public String toString() {
		return "Your percentage less than 35 you not qualify";
	}
}
class FeesNotPaidException extends Exception{
	public String toString() {
		return "Fees not paid! pay first";
	}
}
class InsufficientFeesException extends Exception{
	public String toString() {
		return "You have not pay upto 30% of Fees";
	}
}
class TestForm{
	public static void main(String[] args) {
		AdmissionForm a1=new AdmissionForm("Aniket",18,45,37000,20000);
		
		try {
			a1.validateForm();
			System.out.println(a1);
		}
		catch(EmptyNameException a) {
			System.out.println(a);
		}
		catch(UnderageException b) {
			System.out.println(b);
		}
		catch(InvalidPercentageException c) {
			System.out.println(c);
		}
		catch(NotFitForAdmissionException d) {
			System.out.println(d);
		}
		catch(FeesNotPaidException e) {
			System.out.println(e);
		}
		catch(InsufficientFeesException f) {
			System.out.println(f);
		}
	}
}
