class Shape{
	void area(double a,double b){
		double c =0.5;
		double result=c *a*b;
		System.out.println("Area of triangle is:- "+result);
	}
	void area(int a,int b){
		int result=a*b;
		System.out.println("Area of Reactangle is:- "+result);
	}
	void area(int b){
		double a=3.14;
		double result = a * (b*b);
		System.out.println("Area of circle is:- "+result);
	}
}
class Triangle{
	public static void main(String args[]){
		Shape t1=new Shape();
		double base=5,height=10;
		
		t1.area(base,height);
		System.out.println();
	}
}
class Rectangle{
	public static void main(String args[]){
		Shape r1=new Shape();
		int length=4,breadth=6;
		r1.area(length,breadth);
		System.out.println();
	}
}
class Circle{
	public static void main(String args[]){
		Shape c1=new Shape();
		int radius=7;
		c1.area(radius);
		System.out.println();
	}
}