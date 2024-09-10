public class Oops {
    
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ball";

        pen1.printColor();
        pen2.printColor();

        Student s1=new Student();
        s1.name="divyansh sinha";
        s1.age=20;

        Student s2=new Student();
        s2.name="Sumit kumar";
        s2.age=22;

        s1.printInfo();
        s2.printInfo();
    }
}

class Pen
{
    //class data
    String color;
    String type;

    //class members
    public void write()
    {
        System.out.println("Writing Something");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
