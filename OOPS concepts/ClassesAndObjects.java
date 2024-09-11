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
