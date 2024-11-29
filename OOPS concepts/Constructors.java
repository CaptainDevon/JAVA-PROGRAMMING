class Student {
    String name;
    int age;

    // non parameterized constructor
    Student() 
    {
        
    }

    // parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
    }

    public void studentinfo() {
        System.out.println(this.name + " " + this.age);
    }
}