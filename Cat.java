/*
Name: Amarren Hopkins
Date: 4/3/26
Assingment SDC230 Performance Assesment Extendeding and Overriding
This program will display an animals name and how many legs it has and do the same thing but for specifically a cat
i think not too sure (cat class) */
class Cat extends Animal {
    private String Sound;

    public Cat(String name, int legs, String sound){
        super(name, legs);
        Sound = sound;
    }
    //set and get

    public void setSound(String sound){
        Sound = sound;
    }

    public String getSound(){
        return Sound;
    }
    //PrintAnimal class but it prints cat instead 
    @Override
    public void PrintAnimal(){
        System.out.println("The Cat's name is "+getName()+" it has "+getLegs()+" legs and it is making a "+Sound+" sound");
    }
}
