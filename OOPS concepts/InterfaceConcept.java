interface Jaanwar
{
    int eyes =2;
    public void walk();
}

interface Herbivore
{
    public void eat();
}

class Ghoda implements Jaanwar,Herbivore{
    public void walk()
    {
        System.out.println("chaar pairon pe chalta hai");
    }
    public void eat()
    {
        System.out.println("Ghaas phoos khaata hai");
    }
}

