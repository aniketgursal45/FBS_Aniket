package s;

abstract class Animal {
	String name;
    String sound;
    int age;

    Animal(){
        name="Unknown";
        sound="Silent";
        age=0;
    }

    Animal(String name,String sound,int age){
        this.name=name;
        this.sound=sound;
        this.age=age;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getSound(){
        return sound;
    }

    void setSound(String sound){
        this.sound=sound;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age=age;
    }
    void animalSound() {
        System.out.println("Animal makes some sound");
    }

    public abstract String toString();

}//super class ends here

class Dog extends Animal{
    String breed;

    Dog(String name,String sound,int age,String breed){
        super(name,sound,age);
        this.breed=breed;
    }

    String getBreed(){
        return breed;
    }

    void setBreed(String breed){
        this.breed=breed;
    }
    
    public String toString() {
    	return "Animal Name: "+this.name+" Sound:- "+this.sound+" Age:- "+this.age+" Breed:- "+this.breed;
    }
    void animalSound() {
        System.out.println("Dog barks");
    }

}//dog class ends here

class Cat extends Animal{
    String color;

    Cat(String name,String sound,int age,String color){
        super(name,sound,age);
        this.color=color;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }
    public String toString() {
    	return "Animal Name: "+this.name+" Sound:- "+this.sound+" Age:- "+this.age+" Color:- "+this.color;
    }
    void animalSound() {
        System.out.println("Cat meows");
    }
    
}//cat class ends here

class Bird extends Animal{
    double wingspan;

    Bird(String name,String sound,int age,double wingspan){
        super(name,sound,age);
        this.wingspan=wingspan;
    }

    double getWingspan(){
        return wingspan;
    }

    void setWingspan(double wingspan){
        this.wingspan=wingspan;
    }
    public String toString() {
    	return "Animal Name: "+this.name+" Sound:- "+this.sound+" Age:- "+this.age+" Wingspan:- "+this.wingspan+"m";
    }
    void animalSound() {
        System.out.println("Bird chirps");
    }

}//bird class ends here

class testAnimal{
    public static void main(String[] args){
    	Animal a1;
        a1=new Dog("Tommy","Bark",5,"Labrador");
        System.out.println(a1);
        a1.animalSound();  
        a1=new Cat("Kitty","Meow",3,"White");
        System.out.println(a1);
        a1.animalSound();
        a1=new Bird("Parrot","Chirp",2,0.4);
        System.out.println(a1);
        a1.animalSound();

    }
}//main class ends here

