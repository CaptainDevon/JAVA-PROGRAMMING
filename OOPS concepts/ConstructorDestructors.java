class Fruit {
    public String name;

    // non parameterized constructor
    Fruit() {
        System.out.println("This is the non parameterized constructor");
    }

    // parameterized constructor
    Fruit(String name) {
        this.name = name;
        System.out.println("This is a parameterized constructor as it gives " + this.name);
    }

    // copy constructor
    Fruit(Fruit f)
    {
        this.name=f.name;
        System.out.println("This is the copy constructor it gives me "+this.name);
    }   

    //java has a garbage collector hence there is no destructor concept used.
}
