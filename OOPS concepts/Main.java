public class Main {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        Pen pen2=new Pen();
        //using of properties
        pen1.colour="blue";
        pen1.type="ball";
        
        pen2.colour="black";
        pen2.type="gel";
        //calling of methods
        pen1.write();
        pen1.printColour();
        pen1.printType();
        pen2.write();
        pen2.printColour();
        pen2.printType();

        //non parameterized constructor
        Student s1=new Student();
        s1.studentinfo();

        //parameterized constructor
        Student s2=new Student("diyansh Sinha",20);
        s2.studentinfo();

        Student s3=new Student(s2);
        s3.studentinfo();
    }
}
