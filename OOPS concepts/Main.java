import Sample.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "divyansh sinha";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Sumit kumar";
        s2.age = 22;

        s1.printInfo();
        s2.printInfo();

        System.out.println("====================================================================================");

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Apple");
        Fruit f3 = new Fruit(f2);

        System.out.println("====================================================================================");

        Sample.Polymorphism p1 = new Sample.Polymorphism();
        p1.printInfo("Divyansh Sinha");
        p1.printInfo(20);
        p1.printInfo();

        System.out.println("====================================================================================");
        Triangle t1 = new Triangle();
        t1.color = "Red";
        
        System.out.println("====================================================================================");
        // as the animal class is abstracted hence we cannot produce the output as it goes under runtime error
        // Animal animal=new Animal();  --> gives cannot instantiate the type Animal  
        
        Horse horse=new Horse();
        Chicken chicken=new Chicken();
        horse.walk();
        chicken.walk();

        System.out.println("====================================================================================");

        Ghoda g=new Ghoda();
        g.walk();
        g.eat();
    }
}
