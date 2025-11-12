class Calculator{
	void add(int a,int b){
		System.out.println("a1 is call");
		int c =a+b;
  		System.out.println(c);
	}
	void add(double a,double b){
		System.out.println("a2 is call");
		double c =a+b;
  		System.out.println(c);
	}
	void add(int a,double b){
		System.out.println("a3 is call");
		double c =a+b;
  		System.out.println(c);
	}
	void add(double a,int b){
		System.out.println("a4 is call");
		double c =a+b;
  		System.out.println(c);
	}
	void sub(int a,int b){
		System.out.println("s1 is call");
		int c =a-b;
  		System.out.println(c);
	}
	void sub(double a,double b){
		System.out.println("s2 is call");
		double c =a-b;
  		System.out.println(c);
	}
	void sub(int a,double b){
		System.out.println("s3 is call");
		double c =a-b;
  		System.out.println(c);
	}
	void sub(double a,int b){
		System.out.println("s4 is call");
		double c =a-b;
  		System.out.println(c);
	}
	void mul(int a,int b){
		System.out.println("m1 is call");
		int c =a*b;
  		System.out.println(c);
	}
	void mul(double a,double b){
		System.out.println("m2 is call");
		double c =a*b;
  		System.out.println(c);
	}
	void mul(int a,double b){
		System.out.println("m3 is call");
		double c =a*b;
  		System.out.println(c);
	}
	void mul(double a,int b){
		System.out.println("m4 is call");
		double c =a*b;
  		System.out.println(c);
	}
	void div(int a,int b){
		System.out.println("d1 is call");
		int c =a/b;
  		System.out.println(c);
	}
	void div(double a,double b){
		System.out.println("d2 is call");
		double c =a/b;
  		System.out.println(c);
	}
	void div(int a,double b){
		System.out.println("d3 is call");
		double c =a/b;
  		System.out.println(c);
	}
	void div(double a,int b){
		System.out.println("d4 is call");
		double c =a/b;
  		System.out.println(c);
	}

	
}
class testCalculator{
	public static void main(String[] args){
	Calculator c1= new Calculator();
	int a=1;
	double b=22.10;
	System.out.println();
	c1.add(a,a);
	c1.add(b,b);
	c1.add(a,b);
	c1.add(b,a);
	System.out.println();
	c1.sub(a,a);
	c1.sub(b,b);
	c1.sub(a,b);
	c1.sub(b,a);
	System.out.println();
	c1.mul(a,a);
	c1.mul(b,b);
	c1.mul(a,b);
	c1.mul(b,a);
	System.out.println();
	c1.div(a,a);
	c1.div(b,b);
	c1.div(a,b);
	c1.div(b,a);


}
}
