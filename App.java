/*
Name: Amarren Hopkins
Date: 4/3/26
Assingment SDC230 Performance Assesment Extendeding and Overriding
This program will display an animals name and how many legs it has and do the same thing but for specifically a cat
i think not too sure  */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Amarren Hopkins - Week 5 PA Extending and Overriding");
        System.out.println();
        Animal a1 = new Animal("Bird",2);
        Cat c1 = new Cat("Leo", 4, "Meow");
        a1.PrintAnimal();
        c1.PrintAnimal();

        a1.setName("harambe");
        a1.setLegs(2);

        c1.setName("Lion");
        c1.setLegs(4);
        c1.setSound("Roar");
        //the prints
        System.out.println();
        a1.PrintAnimal();
        c1.PrintAnimal();
    }
}
