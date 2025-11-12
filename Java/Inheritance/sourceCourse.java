package defence;

class Course {
	 String courseName;
	    int duration;
	    double fee;

	    Course(){
	        courseName="Unknown";
	        duration=0;
	        fee=0.0;
	    }

	    Course(String courseName,int duration,double fee){
	        this.courseName=courseName;
	        this.duration=duration;
	        this.fee=fee;
	    }

	    String getCourseName(){
	        return courseName;
	    }

	    void setCourseName(String courseName){
	        this.courseName=courseName;
	    }

	    int getDuration(){
	        return duration;
	    }

	    void setDuration(int duration){
	        this.duration=duration;
	    }

	    double getFee(){
	        return fee;
	    }

	    void setFee(double fee){
	        this.fee=fee;
	    }

	    void display(){
	        System.out.println("Course Name: "+courseName);
	        System.out.println("Duration: "+duration+" weeks");
	        System.out.println("Fee: "+fee);
	    }
	}//superclass ends here

class OnlineCourse extends Course{
	    String platform;

	    OnlineCourse(String courseName,int duration,double fee,String platform){
	        super(courseName,duration,fee);
	        this.platform=platform;
	    }

	    String getPlatform(){
	        return platform;
	    }

	    void setPlatform(String platform){
	        this.platform=platform;
	    }

	    void display(){
	        super.display();
	        System.out.println("Platform: "+platform);
	    }
	}//online sub class ends here

class OfflineCourse extends Course{
	    String location;

	    OfflineCourse(String courseName,int duration,double fee,String location){
	        super(courseName,duration,fee);
	        this.location=location;
	    }

	    String getLocation(){
	        return location;
	    }

	    void setLocation(String location){
	        this.location=location;
	    }

	    void display(){
	        super.display();
	        System.out.println("Location: "+location);
	    }
	}//offline subclass ends here

class HybridCourse extends Course{
	    String schedule;

	    HybridCourse(String courseName,int duration,double fee,String schedule){
	        super(courseName,duration,fee);
	        this.schedule=schedule;
	    }

	    String getSchedule(){
	        return schedule;
	    }

	    void setSchedule(String schedule){
	        this.schedule=schedule;
	    }

	    void display(){
	        super.display();
	        System.out.println("Schedule: "+schedule);
	    }
	}//hybridcourse ends here

class testCourse{
	    public static void main(String[] args){
	    	OnlineCourse oc = new OnlineCourse("Python for Beginners",6,3500,"Udemy");
	    	OfflineCourse ofc = new OfflineCourse("Full Stack Development",16,18000,"Mumbai Campus");
	    	HybridCourse hc = new HybridCourse("Machine Learning Masterclass",14,20000,"Evening Batch");


	        oc.display();
	        System.out.println();
	        ofc.display();
	        System.out.println();
	        hc.display();
	    }
	}//main class ends
