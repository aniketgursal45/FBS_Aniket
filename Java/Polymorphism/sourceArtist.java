package s;

class Artist {
    String name, gender, famousWork;
    int age, experience;

    Artist() {
        super();
        this.name = "Unknown Artist";
        this.gender = "Unknown";
        this.famousWork = "None";
        this.age = 25;
        this.experience = 1;
    }

    Artist(String name, String gender, String famousWork, int age, int experience) {
        super();
        this.name = name;
        this.gender = gender;
        this.famousWork = famousWork;
        this.age = age;
        this.experience = experience;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getGender() {
        return gender;
    }
    void setGender(String gender) {
        this.gender = gender;
    }

    String getFamousWork() {
        return famousWork;
    }
    void setFamousWork(String famousWork) {
        this.famousWork = famousWork;
    }

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    int getExperience() {
        return experience;
    }
    void setExperience(int experience) {
        this.experience = experience;
    }

    void display() {
        System.out.println("Name:- " + this.name);
        System.out.println("Gender:- " + this.gender);
        System.out.println("Famous Work:- " + this.famousWork);
        System.out.println("Age:- " + this.age);
        System.out.println("Experience (years):- " + this.experience);
    }
    void perform() {
        System.out.println("Artist performs...");
    }
}
// Artist superclass ends here

class Singer extends Artist {
    int noOfSongs;
    String genre;
    boolean hasAward;

    Singer() {
        super();
        this.noOfSongs = 50;
        this.genre = "Pop";
        this.hasAward = true;
    }

    Singer(String name, String gender, String famousWork, int age, int experience,
           int noOfSongs, String genre, boolean hasAward) {

        super(name, gender, famousWork, age, experience);
        this.noOfSongs = noOfSongs;
        this.genre = genre;
        this.hasAward = hasAward;
    }

    int getNoOfSongs() {
        return noOfSongs;
    }
    void setNoOfSongs(int noOfSongs) {
        this.noOfSongs = noOfSongs;
    }

    String getGenre() {
        return genre;
    }
    void setGenre(String genre) {
        this.genre = genre;
    }

    boolean isHasAward() {
        return hasAward;
    }
    void setHasAward(boolean hasAward) {
        this.hasAward = hasAward;
    }

    void display() {
        super.display();
        System.out.println("Number of Songs:- " + this.noOfSongs);
        System.out.println("Genre:- " + this.genre);
        System.out.println("Has Award:- " + this.hasAward);
    }
    void perform() {
        System.out.println("Singer is singing ");
    }
}
// Singer subclass ends here

class Painter extends Artist {
    String style, medium;
    int noOfPaintings;

    Painter() {
        super();
        this.style = "Abstract";
        this.medium = "Oil Paint";
        this.noOfPaintings = 30;
    }

    Painter(String name, String gender, String famousWork, int age, int experience,
            String style, String medium, int noOfPaintings) {

        super(name, gender, famousWork, age, experience);
        this.style = style;
        this.medium = medium;
        this.noOfPaintings = noOfPaintings;
    }

    String getStyle() {
        return style;
    }
    void setStyle(String style) {
        this.style = style;
    }

    String getMedium() {
        return medium;
    }
    void setMedium(String medium) {
        this.medium = medium;
    }

    int getNoOfPaintings() {
        return noOfPaintings;
    }
    void setNoOfPaintings(int noOfPaintings) {
        this.noOfPaintings = noOfPaintings;
    }

    void display() {
        super.display();
        System.out.println("Painting Style:- " + this.style);
        System.out.println("Medium:- " + this.medium);
        System.out.println("No. of Paintings:- " + this.noOfPaintings);
    }
    void perform() {
        System.out.println("Painter is painting ");
    }
}
// Painter subclass ends here

class Actor extends Artist {
    int noOfMovies;
    String actingStyle;
    boolean isFamous;

    Actor() {
        super();
        this.noOfMovies = 20;
        this.actingStyle = "Method Acting";
        this.isFamous = true;
    }

    Actor(String name, String gender, String famousWork, int age, int experience,
          int noOfMovies, String actingStyle, boolean isFamous) {

        super(name, gender, famousWork, age, experience);
        this.noOfMovies = noOfMovies;
        this.actingStyle = actingStyle;
        this.isFamous = isFamous;
    }

    int getNoOfMovies() {
        return noOfMovies;
    }
    void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }

    String getActingStyle() {
        return actingStyle;
    }
    void setActingStyle(String actingStyle) {
        this.actingStyle = actingStyle;
    }

    boolean isFamous() {
        return isFamous;
    }
    void setFamous(boolean famous) {
        isFamous = famous;
    }

    void display() {
        super.display();
        System.out.println("No. of Movies:- " + this.noOfMovies);
        System.out.println("Acting Style:- " + this.actingStyle);
        System.out.println("Is Famous:- " + this.isFamous);
    }
    void perform() {
        System.out.println("Actor is acting ");
    }
}
// Actor subclass ends here

class testArtist {
    public static void main(String[] args) {

       Artist a1;
       a1= new Singer("Arjit Singh", "Male", "Tum Hi Ho", 36, 15, 200, "Melody", true);
       System.out.println("Singer");
       System.out.println();
       a1.display();
       a1.perform();
       System.out.println();
       a1 = new Painter("Vincent Van Gogh", "Male", "Starry Night", 37, 10,
                "Post-Impressionist", "Oil Paint", 900);
       System.out.println("Painter");
       System.out.println();
       a1.display();
       a1.perform();
       System.out.println();
        a1 = new Actor("Shah Rukh Khan", "Male", "DDLJ", 58, 30,
                90, "Romantic + Method Acting", true);
        System.out.println("Actor");
        System.out.println();
        a1.display();
        a1.perform();


    }
}
