package sj;
import java.util.Scanner;
class Login {
	String username,password;
	String uname,pass;
	Login(){
		this.username="admin";
		this.password="12345a";
	}
	
	void setUsername(String a) {
		this.username=a;
	}
	String getUsername() {
		return this.username;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}
	Boolean Tusername=false;
	Boolean Tpass=false;
	
	void validateUsername() throws InvalidUsernameException{
		if(this.username.equals(this.uname)) {
			this.Tusername=true;
		}else {
			throw new InvalidUsernameException();
		}
	}
	void validatePassword() throws InvalidPasswordException{
		if(this.password.equals(this.pass)) {
			this.Tpass=true;
		}  else {
			System.out.println("Try again!");
	        throw new InvalidPasswordException();   
	    }

	}

}
class InvalidUsernameException extends Exception{
	public String toString() {
		return "Username doesnt match!";
	}
}
class InvalidPasswordException extends Exception{
	public String toString() {
		return "password incoreect!";
	}
}
class LoginTest{
	public static void main(String[] args) {
		Login l1=new Login();
		int attempts =0;
		try {
			System.out.println("Login Form! ");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Username");
			l1.uname=sc.nextLine();
			l1.validateUsername();
		
		while(attempts<=2) {
		try {
			l1.Tpass=false;
			if(l1.Tusername==true) {
				System.out.print("Enter Password:- ");
				l1.pass=sc.nextLine();
				l1.validatePassword();
				if(l1.Tpass==true) {
					System.out.println("Login Successfull!");
					return;
				}				
					
			}
		}catch(InvalidPasswordException b) {
			attempts++;
			System.out.println(b);
		}
	}
		if(attempts==3) {
			System.out.println("Your account is locked");
			return;
		}
		}catch(InvalidUsernameException a) {
			System.out.println(a);
	}
}
}
