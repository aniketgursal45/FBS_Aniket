package s;

class Shape {
    String shapeName;
    String color;
    int borderThickness;
    
    Shape(){
        this.shapeName = "Shape";
        this.color = "Red";
        this.borderThickness = 2;
    }
    Shape(String a,String b,int c){
    	  this.shapeName = a;
          this.color = b;
          this.borderThickness = c;
    }
    
    
    String getShapeName() {
		return shapeName;
	}
	void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	int getBorderThickness() {
		return borderThickness;
	}
	void setBorderThickness(int borderThickness) {
		this.borderThickness = borderThickness;
	}
	void display(){
        System.out.println("Shape Name: " + this.shapeName);
        System.out.println("Color: " + this.color);
        System.out.println("Border Thickness: " + this.borderThickness);
    }
	void area() {
		System.out.println("Area of shape");
	}
}//shape class ends here

class Triangle extends Shape{
	double base,height;
	
	Triangle(){
		super();
		this.base=5.0;
		this.height=10.0;
	}
	Triangle(String a,String b,int c,double d,double e){
		super(a,b,c);
		this.base=d;
		this.height=e;
	}
	double getBase() {
		return base;
	}
	void setBase(double base) {
		this.base = base;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	void display(){
        super.display();
        System.out.println("Base:- " + this.base);
        System.out.println("Height:- " + this.height);
    }
	void area() {
		double c=0.5;
		double result=c *this.base*this.height;
		System.out.println("Area of triangle is:- "+result);
	}
}//Triangle sub class ends here
class Rectangle extends Shape{
	int length,breadth;
	
	Rectangle(){
		super();
		this.length=4;
		this.breadth=6;
	}
	Rectangle(String a,String b,int c,int d,int e){
		super(a,b,c);
		this.length=d;
		this.breadth=e;
	}
	
	int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	int getBreadth() {
		return breadth;
	}
	void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	void display(){
        super.display();
        System.out.println("length:- " + this.length);
        System.out.println("breadth:- " + this.breadth);
    }
	void area() {
		int result=this.length*this.breadth;
		System.out.println("Area of Reactangle is:- "+result);
	}
}//Rectangle subclass ends here
class Circle extends Shape{
	int radius;
	
	Circle(){
		super();
		this.radius=7;
	}
	Circle(String a ,String b,int c,int d){
		super(a,b,c);
		this.radius=d;
	}
	int getRadius() {
		return radius;
	}
	void setRadius(int radius) {
		this.radius = radius;
	}
	void display() {
		 super.display();
	     System.out.println("Radius:- " + this.radius);
	}
	void area() {
		double a=3.14;
		double result = a * (this.radius*this.radius);
		System.out.println("Area of circle is:- "+result);
	}
}//circle sub class ends here
class testShape{
	public static void main(String[] args) {
		Shape s1;
		System.out.println("Triangle");
		s1=new Triangle("Triangle","Blue",2,5.0,10.0);
		s1.display();
		s1.area();
		System.out.println();
		System.out.println("Rectangle");
		s1= new Rectangle("Rectangle","Green",3,4,6);
		s1.display();
		s1.area();
		System.out.println();
		System.out.println("Circle");
		s1= new Circle("Circle","Yellow",1,7);
		s1.display();
		s1.area();

	}
}

