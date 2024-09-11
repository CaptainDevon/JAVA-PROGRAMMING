package Sample;
public class Polymorphism {
    //compiler time polymorphism -->function overloading
    String name;
    int age;
    int standard;
    public void printInfo(String name)
    {
        this.name=name;
        System.out.println("This function gives the name "+this.name);
    }

    public void printInfo(int age)
    {
        this.age=age;
        System.out.println("This function gives the age "+this.age);
    }

    public void printInfo()
    {
        System.out.println("This is a default function");
    }
}
