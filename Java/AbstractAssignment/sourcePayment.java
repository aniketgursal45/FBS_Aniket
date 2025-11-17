package s;

abstract class Payment {
	String paymentId,payerName,status;
	double amount;
	
	Payment(){
		this.paymentId="NA";
		this.amount=0.0;
		this.payerName="Unknown";
		this.status="PENDING";
	}
	
	Payment(String a,double b,String c,String d){
		this.paymentId=a;
		this.amount=b;
		this.payerName=c;
		this.status=d;
	}

	String getPaymentId() {
		return paymentId;
	}

	void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	String getPayerName() {
		return payerName;
	}

	void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}
	
	void printSummary() {
		System.out.println("Payment Id:- "+this.paymentId);
		System.out.println("Amount:- "+this.amount);
		System.out.println("payer Name:- "+this.payerName);
		System.out.println("Status:- "+this.status);
	}
	final void process() {
		boolean valid = validate();
			if(valid) {
				deductAmount();
				sendNotification();
				this.status="SUCCESS";
			}else {
				this.status="FAILED";
			}
	}
		abstract boolean validate();
		abstract void deductAmount();
		abstract void sendNotification();
}//abstract superclass payment ends here
class CardPayment extends Payment{
	String cardNumber,cvv;
	
	CardPayment() {
	    super();                        
	    this.cardNumber = "0000000000000000";   
	    this.cvv = "000";                      
	}
	CardPayment(String c,double d,String e,String a,String b) {
	    super(c,d,e,"PENDING");                        
	    this.cardNumber = a;   
	    this.cvv = b;                      
	}
	String getCardNumber() {
		return cardNumber;
	}
	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	String getCvv() {
		return cvv;
	}
	void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	boolean validate() {
		if(cardNumber.length() == 16 && cvv.length()==3 && amount > 0  ) {
			return true;
		}else {
			return false;
		}
	}
	
	void deductAmount() {
			System.out.println("Deducting ₹"+this.amount+" from card:- "+this.cardNumber);
	}
	void sendNotification() {
		System.out.println("Notification sent to:- "+this.payerName+" for card payment.");
	}
}//cardpayment sub class  ends here
class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment(){
		super();
		this.upiId="UNKNOWN";
	}
	UPIPayment(String c,double d,String e,String a){
		super(c,d,e,"PENDING");
		this.upiId=a;
	}
	String getUpiId() {
		return upiId;
	}
	void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	boolean validate() {
		if(upiId.contains("@") && amount >= 1 && amount <= 100000) {
			return true;
		}else {
			return false;
		}
	}
	void deductAmount() {
		System.out.println("Deducting ₹"+this.amount+" from upiId:- "+this.upiId);
}
	void sendNotification() {
		System.out.println("Notification sent to:- "+this.payerName+" for UPI payment.");
	}
	
}
class testPayment{
	public static void main(String[] args) {
		Payment p1;
		p1=new CardPayment("P1", 500.0, "Alice", "1234567890123456", "123");
		p1.process();
		p1.printSummary();
		System.out.println();
		p1=new CardPayment("P2", -10.0, "Bob", "1111222233334444", "12");
		p1.process();
		p1.printSummary();
		System.out.println();
		p1=new UPIPayment("P3", 2500.0, "Charlie", "charlie@upi");
		p1.process();
		p1.printSummary();
		System.out.println();
		p1=new UPIPayment("P4", 200000.0, "Daisy", "daisy");
		p1.process();
		p1.printSummary();
	}
}//main class ends here
