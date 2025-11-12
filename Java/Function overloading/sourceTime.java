class Time{
	int hr,min,sec;

        Time(int a,int b,int c){
		this.hr = a;
		this.min = b;
		this.sec = c;
}
	void add(Time t1,Time t2){
		int tsec = t1.sec + t2.sec;
		int fsec = tsec % 60;
		int rsec = tsec /60;
		int tmin =t1.min+t2.min+rsec;
		int fmin = tmin % 60;
		int  rmin = tmin /60;
		int fhr= t1.hr+t2.hr+rmin;
		System.out.println(fhr+":"+fmin+":"+fsec);
	}
	void add(Time t1,int a){
		t1.hr= t1.hr +a;
		System.out.println(t1.hr+":"+t1.min+":"+t1.sec);
	}
	void add(int a,Time t1){
		int chr = a /60;
		int rmin = a % 60;
		t1.min= t1.min+rmin;
		t1.hr = t1.hr + chr;
		System.out.println(t1.hr+":"+t1.min+":"+t1.sec);
}
}
class testTime{
	public static void main(String[] args){
		Time t1=new Time(1,30,40);
		Time t2=new Time(2,45,30);
		t1.add(t1,t2);
		t1.add(t1,2);
		t1.add(120,t1);
}
}