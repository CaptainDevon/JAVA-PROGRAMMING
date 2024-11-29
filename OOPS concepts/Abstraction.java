abstract class Animal {
    Animal() {
        System.out.println("You have created an animal");
    }

    abstract void walk();

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal
{

    Horse() {
        System.out.println("You have created a horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

class Cow implements Janwar,Herbivore
{
    public void eat()
    {
        System.out.println("Eats grass");
    }

    public void walk()
    {
        System.out.println("Walks on 4 legs");
    }
}