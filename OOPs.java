// OBJECT

// ORIENTED PROGRAMMING SYSTEMS
// JAVA
// Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below : 
// Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class
//   . The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does 
// not occupy any memory space till the time an object is instantiated. 
// Object is a run-time entity. It is an instance of the class
//   . An object can represent a person, place or any other item. An object can operate on both data members and member functions. 
class OOPs {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Mukul Sarker";
        s1.age = 22;
        s1.printinfo();

        // Student s2 = new Student("Mukul Sarker", 24);
        // s2.printinfo();
        Student s3 = new Student(s1);
        s3.printinfo();

        MNC c = new MNC();
        c.salaryStructure("Google", 4500000);

        Shape s = new Shape();
        s.area();

        Triangle t = new Triangle();
        t.area();

        Circle c1 = new Circle();
        c1.area();

    }
}

class Student {

    String name;
    int age;

    public void printinfo() {
        System.out.println("My name is " + this.name);
        System.out.println("My age is " + this.age);
    }

    // Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor(or no
    //      -argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.
    Student() {
        System.out.println("COnstructor called");
    }

    // 2. Parameterized constructor : Constructor which has parameters is called a parameterized constructor. It is used to provide 
    // different values to distinct objects. 
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
    // 3. Copy Constructor : A Copy constructor is an overloaded 
    // constructor used to declare and initialize an object from another 
    Student(Student s3) {
        this.name = s3.name;
        this.age = s3.age;
    }

}

// Polymorphism
// Polymorphism 
// Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’. 
// Types of Polymorphism IMP 
// 1. Compile Time Polymorphism (Static) 
// 2. Runtime Polymorphism (Dynamic) 
// Let’s understand them one by one : 
// Compile Time Polymorphism : The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading 
// Method Overloading : Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis: 
class MNC {

    String name;
    int salary;

    public void salaryStructure(String name) {
        System.out.println(name);
    }

    public void salaryStructure(int salary) {
        System.out.println(salary);
    }

    public void salaryStructure(String name, int salary) {
        System.out.println("Company name " + name);
        System.out.println("Company salary " + salary);
    }
}

// Runtime Polymorphism : Runtime polymorphism is also known as dynamic polymorphism. Function overriding is an example of runtime polymorphism. Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, parent and child classes both contain the same function with a different definition. The call to the function is determined at runtime is known as runtime polymorphism.
class Shape {

    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {

    public void area(int h, int b) {
        System.out.println((1 / 2 * b * h));
    }
}

class Circle extends Shape {

    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
