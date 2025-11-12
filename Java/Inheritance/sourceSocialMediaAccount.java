package defence;

class SocialMediaAccount {
	String userName,email,countryOrigin,createdDate;
	boolean isPublic,isVerified;
	int noOfPosts,noOfLikes,noOfComments,noOfImpressions;
	
	SocialMediaAccount(){
		super();
	    this.userName = "Aniket_123";
	    this.email = "aniket@gmail.com";
	    this.countryOrigin = "India";
	    this.createdDate = "2020-05-15";
	    this.isPublic = true;
	    this.isVerified = true;
	    this.noOfPosts = 450;
	    this.noOfLikes = 12000;
	    this.noOfComments = 3500;
	    this.noOfImpressions = 200000;
	}
	
	SocialMediaAccount(String a,String b,String c,String d,boolean e,boolean f,int g,int h,int i,int j){
	    this.userName = a;
	    this.email = b;
	    this.countryOrigin = c;
	    this.createdDate = d;
	    this.isPublic = e;
	    this.isVerified = f;
	    this.noOfPosts = g;
	    this.noOfLikes = h;
	    this.noOfComments = i;
	    this.noOfImpressions = j;
	}

	String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getCountryOrigin() {
		return countryOrigin;
	}

	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	String getCreatedDate() {
		return createdDate;
	}

	void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	boolean isPublic() {
		return isPublic;
	}

	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	boolean isVerified() {
		return isVerified;
	}

	void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	int getNoOfPosts() {
		return noOfPosts;
	}

	void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}

	int getNoOfLikes() {
		return noOfLikes;
	}

	void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	int getNoOfComments() {
		return noOfComments;
	}

	void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}

	int getNoOfImpressions() {
		return noOfImpressions;
	}

	void setNoOfImpressions(int noOfImpressions) {
		this.noOfImpressions = noOfImpressions;
	}
	
	void display(){
	    System.out.println("User Name :- " + this.userName);
	    System.out.println("Email :- " + this.email);
	    System.out.println("Country of Origin :- " + this.countryOrigin);
	    System.out.println("Account Created Date :- " + this.createdDate);
	    System.out.println("Is Public :- " + this.isPublic);
	    System.out.println("Is Verified :- " + this.isVerified);
	    System.out.println("Number of Posts :- " + this.noOfPosts);
	    System.out.println("Number of Likes :- " + this.noOfLikes);
	    System.out.println("Number of Comments :- " + this.noOfComments);
	    System.out.println("Number of Impressions :- " + this.noOfImpressions);
	}	
}
class InstagramAccount extends SocialMediaAccount{
	int noOfFollowers,noOfFollowing,noOfHighlights,noOfPostArchived,noOfStoryArchived,noOfAudioSound;
	
	InstagramAccount(){
		super();
	    this.noOfFollowers = 10000;
	    this.noOfFollowing = 500;
	    this.noOfHighlights = 25;
	    this.noOfPostArchived = 50;
	    this.noOfStoryArchived = 100;
	    this.noOfAudioSound = 30;
	}
	InstagramAccount(String userName,String email,String countryOrigin,String createdDate,boolean isPublic,boolean isVerified,int noOfPosts,int noOfLikes,int noOfComments,int noOfImpressions,int a,int b,int c,int d,int e,int f){
		super(userName,email,countryOrigin,createdDate,isPublic,isVerified,noOfPosts,noOfLikes,noOfComments,noOfImpressions);
	    this.noOfFollowers = 10000;
	    this.noOfFollowing = 500;
	    this.noOfHighlights = 25;
	    this.noOfPostArchived = 50;
	    this.noOfStoryArchived = 100;
	    this.noOfAudioSound = 30;
	}
	int getNoOfFollowers() {
		return noOfFollowers;
	}
	void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}
	int getNoOfFollowing() {
		return noOfFollowing;
	}
	void setNoOfFollowing(int noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}
	int getNoOfHighlights() {
		return noOfHighlights;
	}
	void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}
	int getNoOfPostArchived() {
		return noOfPostArchived;
	}
	void setNoOfPostArchived(int noOfPostArchived) {
		this.noOfPostArchived = noOfPostArchived;
	}
	int getNoOfStoryArchived() {
		return noOfStoryArchived;
	}
	void setNoOfStoryArchived(int noOfStoryArchived) {
		this.noOfStoryArchived = noOfStoryArchived;
	}
	int getNoOfAudioSound() {
		return noOfAudioSound;
	}
	void setNoOfAudioSound(int noOfAudioSound) {
		this.noOfAudioSound = noOfAudioSound;
	}
	void display(){
	    super.display();
	    System.out.println("Number of Followers :- " + this.noOfFollowers);
	    System.out.println("Number of Following :- " + this.noOfFollowing);
	    System.out.println("Number of Highlights :- " + this.noOfHighlights);
	    System.out.println("Number of Posts Archived :- " + this.noOfPostArchived);
	    System.out.println("Number of Stories Archived :- " + this.noOfStoryArchived);
	    System.out.println("Number of Audio Sounds :- " + this.noOfAudioSound);
	}
	
}//instagram account ends here
class LinkedInAccount extends SocialMediaAccount{
    int noOfConnections,noOfProfileViews,noOfJobsApplied;

    LinkedInAccount(){
        super();
        this.noOfConnections = 800;
        this.noOfProfileViews = 1500;
        this.noOfJobsApplied = 40;
    }

    LinkedInAccount(String userName,String email,String countryOrigin,String createdDate,boolean isPublic,boolean isVerified,int noOfPosts,int noOfLikes,int noOfComments,int noOfImpressions,int a,int b,int c){
        super(userName,email,countryOrigin,createdDate,isPublic,isVerified,noOfPosts,noOfLikes,noOfComments,noOfImpressions);
        this.noOfConnections = a;
        this.noOfProfileViews = b;
        this.noOfJobsApplied = c;
    }

    int getNoOfConnections(){ return noOfConnections; }
    void setNoOfConnections(int noOfConnections){ this.noOfConnections = noOfConnections; }

    int getNoOfProfileViews(){ return noOfProfileViews; }
    void setNoOfProfileViews(int noOfProfileViews){ this.noOfProfileViews = noOfProfileViews; }

    int getNoOfJobsApplied(){ return noOfJobsApplied; }
    void setNoOfJobsApplied(int noOfJobsApplied){ this.noOfJobsApplied = noOfJobsApplied; }

    void display(){
        super.display();
        System.out.println("Number of Connections :- " + this.noOfConnections);
        System.out.println("Number of Profile Views :- " + this.noOfProfileViews);
        System.out.println("Number of Jobs Applied :- " + this.noOfJobsApplied);
    }
}//linkedin account class ends here
class YouTubeAccount extends SocialMediaAccount{
    int noOfSubscribers,watchTime,estimatedRevenue;
    boolean isMonetized;

    YouTubeAccount(){
        super();
        this.noOfSubscribers = 5000;
        this.watchTime = 12000;
        this.isMonetized = true;
        this.estimatedRevenue = 25000;
    }

    YouTubeAccount(String userName,String email,String countryOrigin,String createdDate,boolean isPublic,boolean isVerified,int noOfPosts,int noOfLikes,int noOfComments,int noOfImpressions,int a,int b,boolean c,int d){
        super(userName,email,countryOrigin,createdDate,isPublic,isVerified,noOfPosts,noOfLikes,noOfComments,noOfImpressions);
        this.noOfSubscribers = a;
        this.watchTime = b;
        this.isMonetized = c;
        this.estimatedRevenue = d;
    }

    int getNoOfSubscribers(){ return noOfSubscribers; }
    void setNoOfSubscribers(int noOfSubscribers){ this.noOfSubscribers = noOfSubscribers; }

    int getWatchTime(){ return watchTime; }
    void setWatchTime(int watchTime){ this.watchTime = watchTime; }

    boolean getIsMonetized(){ return isMonetized; }
    void setIsMonetized(boolean isMonetized){ this.isMonetized = isMonetized; }

    int getEstimatedRevenue(){ return estimatedRevenue; }
    void setEstimatedRevenue(int estimatedRevenue){ this.estimatedRevenue = estimatedRevenue; }

    void display(){
        super.display();
        System.out.println("Number of Subscribers :- " + this.noOfSubscribers);
        System.out.println("Watch Time (hours) :- " + this.watchTime);
        System.out.println("Is Monetized :- " + this.isMonetized);
        System.out.println("Estimated Revenue :- " + this.estimatedRevenue);
    }
}
class testSocialMediaAccount {
	public static void main(String[] args) {
		InstagramAccount i1=new InstagramAccount();
		InstagramAccount i2=new InstagramAccount("Aniket_123","aniket@gmail.com","India","2020-05-15",true,true,450,12000,3500,200000,10000,500,25,50,100,30);
		LinkedInAccount  l1= new LinkedInAccount();
		LinkedInAccount  l2= new LinkedInAccount("Aniket_Patil","aniketpatil@gmail.com","India","2019-08-20",true,true,300,8000,1500,120000,800,1500,40);
		YouTubeAccount   y1=new  YouTubeAccount();
		YouTubeAccount y2=new YouTubeAccount("AniketYT","aniketyt@gmail.com","India","2021-01-10",true,true,600,20000,5000,250000,5000,12000,true,25000);
		
		System.out.println("Instagram");
		System.out.println();
		i1.display();
		System.out.println();
		i2.display();
		System.out.println();
		System.out.println("Linkedin");
		System.out.println();
		l1.display();
		System.out.println();
		l2.display();
		System.out.println();
		System.out.println("Youtube");
		System.out.println();
		y1.display();
		System.out.println();
		y2.display();
		System.out.println();
		
	}
}

