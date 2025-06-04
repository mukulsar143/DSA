class Oops {
    public static void main(String args[]){
        Pen p = new Pen();
        p.color = "Black";
        p.type = "Ball";
        p.printColor();
        Pen p2 = new Pen(p);
        p2.printColor();
        
        Student s = new Student();
        s.info("Mukul");
        s.info(22);
        s.info("Mukul", 22);
        
        
        Account a = new Account();
        a.name = "Google";
        a.email = "google@gmail.com";
        // a.setPassword("1234");
        System.out.println(a.getPassword());
        
        
        Horse h = new Horse();
        h.walk();
        h.eats();

        
        // Animal an = new Animal();
        // an.walk();
        
        Elephant e = new Elephant();
        e.walk();
        
        
        Students.school = "CMS";
        Students st = new Students();
        st.name = "Mukul Sarkar";
        System.out.println(Students.school);
    }
}

class Pen {
    String color;
    String type;
    
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
    Pen(){
        System.out.println("Called");
    }
    Pen(Pen p2){
        System.out.println("Constructor Called");
        this.color = p2.color;
        this.type = p2.type;
    }
    

}

// Polymorphism
class Student {
    String name;
    int age;
    
    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name, int age){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

// Inheritence

class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

class EqaalatedTriangle extends Triangle{
    public void area(int l, int j){
         System.out.println((1/2)*l*j);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.print((3.14)*r*r);
    }
}

// Encapsulation
class Account {
    public String name;
    protected String email;
    private String password;
    
    
    // getter & setters
    
    public String getPassword(){
        setPassword("1234");
        return this.password;
    }
    
    private void setPassword(String pass){
        this.password = pass;
    }
}

// Abstraction

abstract class Animal{
    Animal(){
        System.out.println("New Animal Creating");
    }
    abstract void walk();
    public void eats(){
        System.out.println("Animals eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Creating Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

// Interfaces


interface Animal2 {
    void walk();
}

interface BlackPanther {
    
}

class Elephant implements Animal2, BlackPanther{
    public void walk(){
        System.out.println("Elephants are huge");
    }
}

// Static

class Students {
    String name;
    static String school;
    
    public static void changeSchool(){
        school = "DPS";
    }
}