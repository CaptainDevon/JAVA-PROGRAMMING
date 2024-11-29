class Fruit
{
    public void fruitInfo()
    {
        System.out.println("This is a Fruit");
    }
}

class Apple extends Fruit
{
    
    public void fruitInfo(String colour)
    {
        System.out.println("This is an Apple. It is "+colour+" In colour");
    }
}

class Orange extends Fruit
{
    public void fruitInfo(String colour,String shape)
    {
        System.out.println("This is an Orange. It is "+colour+" In colour and it is "+shape+" In shape");
    }
}

