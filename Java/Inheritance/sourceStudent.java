class Student{
	int FBid;
	String Name;
	int distance;
	static int count=0;
	
	Student(){
		this.FBid=102;
		this.Name="Virat";
		this.distance=78;
		count++;
	}
	Student(int a,String b,int c){
		this.FBid=a;
		this.Name=b;
		this.distance=c;
		count++;
	}
	int getFBid() {
		return FBid;
	}

	void setFBid(int fBid) {
		FBid = fBid;
	}

	String getName() {
		return Name;
	}

	void setName(String name) {
		Name = name;
	}

	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}
	
	void display() {
		System.out.println("Enter fbid:- "+this.FBid);
		System.out.println("Enter Name:- "+this.Name);
		System.out.println("Enter distance:- "+this.distance);
		System.out.println("Total count is:- "+Student.count);
	}
}
class PlacedStudent extends Student{//step 1 "is a realationship"
	//step 2 remove state which is in superclass
	String CName,designation;
	PlacedStudent(){
		super();//step 3a
		this.CName="Google";
		this.designation="Player";
	}
	PlacedStudent(int a,String b,int c,String d,String e){
		super(a,b,c);//step3b
		this.designation=d;
		this.CName=e;
	}

	String getCName() {
		return CName;
	}
	void setCName(String cName) {
		CName = cName;
	}
	String getDesignation() {
		return designation;
	}
	void setDestination(String c) {
		designation = c;
	}
	void display() {
		super.display();//step 4
		System.out.println("Company name is:- "+this.CName);
		System.out.println("Designation is:- "+this.designation);
	}

	
	
	
}
class testStudent{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(101,"Rohit",59);
		PlacedStudent p1=new PlacedStudent();
		PlacedStudent p2=new PlacedStudent(105,"Rahu",98,"BCCI","Batsman");
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();
		p1.display();
		System.out.println();
		p2.display();
	}
}