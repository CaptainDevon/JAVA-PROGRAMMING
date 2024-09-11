/*Inheritance--> When the Child class takes the properties of the Parent class
    it results in inheritance
    there are 4 types of inheritance in java
    1) single level inheritance --> parent to child
    2) multilevel inheritance   --> parent to child to grandchild
    3) Hierarical inheritance   --> parent to child1 and parent to child2
    4) Hybrid inheritance       --> mixture of above three types
    5) multiple inheritance     --> parent1 to child and parent2 to child this is only seen in c++
                                    for java we use the interfaces
*/

//parent class

class Shape {
    String color;

    public void area()
    {
        System.out.println("displayes area");
    }
}

// child class
class Triangle extends Shape {
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r)
    {
        System.out.println(3*22/7*r*r);
    }
}

//grand child class
class EquilateralTriangle extends Triangle{
    public void area(int l)
    {
        System.out.println(Math.sqrt(3)/4*l*l);
    }
}


