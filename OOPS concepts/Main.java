import java.util.*;
import bank.Account;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        // using of properties
        pen1.colour = "blue";
        pen1.type = "ball";

        pen2.colour = "black";
        pen2.type = "gel";
        // calling of methods
        pen1.write();
        pen1.printColour();
        pen1.printType();
        pen2.write();
        pen2.printColour();
        pen2.printType();

        // non parameterized constructor
        Student s1 = new Student();
        s1.studentinfo();

        // parameterized constructor
        Student s2 = new Student("diyansh Sinha", 20);
        s2.studentinfo();

        Student s3 = new Student(s2);
        s3.studentinfo();

        System.out.println("-------------------------------------------------------------------------------");
        People p = new People();
        p.display();
        p.display("Software engineer");
        p.display("Software engineer", 20);
        System.out.println("-------------------------------------------------------------------------------");

        Triangle t = new Triangle();
        t.area();
        t.area(2, 5);

        Child c = new Child();
        c.printInfoGF();
        c.printInfoF();
        c.printInfoC();

        Orange o = new Orange();
        Apple a = new Apple();
        o.fruitInfo();
        o.fruitInfo("Orange", "Round");
        a.fruitInfo();
        a.fruitInfo("Red");

        C ch = new C();
        ch.Info();
        ch.cInfo();
        System.out.println("-------------------------------------------------------------------------------");
        Account a1 = new Account();
        a1.name = "divyansh sinha";
        a1.setPassword("asdhjkdbwjdab");
        System.out.println(a1.getpassword());
        System.out.println("-------------------------------------------------------------------------------");
        Horse h = new Horse();
        h.walk();
        Chicken chik = new Chicken();
        chik.walk();

        Horse nh = new Horse();
        nh.eat();
        System.out.println("-------------------------------------------------------------------------------");

        Cow cow=new Cow();
        cow.eat();
        cow.walk();
    }
}
