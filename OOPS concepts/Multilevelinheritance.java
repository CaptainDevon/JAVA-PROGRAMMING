class GrandFather
{
    public void printInfoGF()
    {
        System.out.println("Hello i am the grandfather");
    }
}

class Father extends GrandFather
{
    public void printInfoF()
    {
        System.out.println("Hello i am the father");
    }
}

class Child extends Father
{
    public void printInfoC()
    {
        System.out.println("Hello i am the child");
    }
}