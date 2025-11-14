package s;

class Animal {
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

    void display(){
        System.out.println("Animal Name: "+name);
        System.out.println("Sound: "+sound);
        System.out.println("Age: "+age);
    }
    void animalSound() {
        System.out.println("Animal makes some sound");
    }
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

    void display(){
        super.display();
        System.out.println("Breed: "+breed);
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

    void display(){
        super.display();
        System.out.println("Color: "+color);
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

    void display(){
        super.display();
        System.out.println("Wingspan: "+wingspan+" m");
    }
    void animalSound() {
        System.out.println("Bird chirps");
    }
}//bird class ends here

class testAnimal{
    public static void main(String[] args){
    	Animal[] a1=new Animal[3];
        a1[0]=new Dog("Tommy","Bark",5,"Labrador");
        a1[1]=new Cat("Kitty","Meow",3,"White");
        a1[2]=new Bird("Parrot","Chirp",2,0.4);

        for(int i=0;i<a1.length;i++) {
        	a1[i].display();
        	a1[i].animalSound();
        	System.out.println();
        }
    }
}//main class ends here

