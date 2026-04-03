/*
Name: Amarren Hopkins
Date: 4/3/26
Assingment SDC230 Performance Assesment Extendeding and Overriding
This program will display an animals name and how many legs it has and do the same thing but for specifically a cat
i think not too sure (Animal class) */
class Animal {
    private String Name;
    private int Legs;

    public Animal(String name, int legs){
        Name = name;
        Legs = legs;
    }
    //set and gets
    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setLegs(int legs){
        Legs = legs;
    }
    public int getLegs(){
        return Legs;
    }
    //print method (personally i would've called this the display method but instructions are instructions)

    public void PrintAnimal(){
        System.out.println("the Animals name is "+Name +" and it has "+Legs+" legs");
    }
}