import java.util.*;

/*
public class Main {

    public static void main(String args[]) {

        //Classes & Objects
        // Pen p1 = new Pen(); //created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // // p1.setColor("Red");     
        // p1.color = "red";   
        // System.out.println(p1.color);

        //Access Modifiers
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ShreeKudande";
        // myAcc.password = "abcdefghi";
        myAcc.setPassword("123456789");

    }
}

class BankAccount {
    public String username;
    private String password;
    default void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

*/

/*
public class Main {

    public static void main(String args[]) {
        //Getters & Setters
        //Get:to return the value
        //Set:to modify the value
        //this:this keyword is used to refer to the current object
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String Color) {
        this.color = Color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
*/

/*
//Constructors
public class Main {
    public static void main(String args[]) {
        // Student s1 = new Student("ShreeKudande");
        // System.out.println(s1.name);
        // Student s1 = new Student();
        // Student s2 = new Student("Shree");
        // Student s3 = new Student(123);
        // // Student s4 = new Student("Shree", 123); this will not work because the constructor is not made for handling both arguments.

        // Student s1 = new Student();
        // s1.name = "Shree";
        // s1.roll = 456;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 100;
        // System.out.println(s2.marks[0]);
        // System.out.println(s2.marks[1]);
        // System.out.println(s2.marks[2]);

        //Single level inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // shark.swim();

        //multi level inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        //hierarchial inheritance
        // Fish fs = new Fish();
        // fs.swim();
        // Bird bd = new Bird();
        // bd.fly();

        //there is also hybrid inheritance

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    //also explore about lazy copy

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    Student() { //non-parameterized
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(int roll) { //parameterized
        marks = new int[3];
        this.roll = roll;
    }
}

//A destructor is a special method used in some programming languages to manually free up memory right before an object is destroyed. Java, however, does not have destructors because it manages memory automatically. Instead of requiring you to manually write code to destroy objects, Java uses a background process called the Garbage Collector, which automatically detects when an object is no longer being used and cleans up its memory for you.


//Inheritance

//base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//derived class | subclass
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }

// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
*/

/*
public class Main {

    public static void main(String args[]) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5,(float) 2.7));
        // System.out.println(calc.sum(1, 2, 3));

        // Deer d = new Deer();
        // d.eat();

        //Packages in Java
        // Package: A folder-like container that groups related classes to organize code and prevent naming conflicts.
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);
        // import java.util.*; //Inbuilt Package
        //There are also User defined Packages
    }
}

//Function Overloading - Compile Time Polymorphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//Function Overriding - Run Time Polymorphism
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
*/

/*
class Main {
    public static void main(String args[]) {
        //     Horse h = new Horse();
        //     h.eat();
        //     h.walk();
        //     // System.out.println(h.color);

        //     Chicken c = new Chicken();
        //     c.eat();
        //     c. walk();

        //     Mustang myHorse = new Mustang();
            //Animal --> Horse --> Mustang

        Queen q = new Queen();
        q.moves();
    }
}


//Abstraction
//Hiding all the unnecessary details and showing only the important parts to the user.
//Two ways to implement 1. Abstract Classes 2. Interfaces
//Abstract = Khayal in hindi
//bottom line - we give idea to the user, but not the exact implementation


//Abstract Class
//-Cannot create an instance/object of abstract class
//-Can have abstract/non-abstract methods
//-can have constructors

abstract class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }

    //non-abstract method
    void eat() {
        System.out.println("animal eats");
    }

    //abstract method
    abstract void walk(); //Idea given

    // Animal a =  new Animal(); //error
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    
    void changeColor() {
        color = "dark brown";
    }
    void walk() { //Implementation
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

//Interfaces
//-multiple Inheritance
//-total abstraction

/*
-All methods are public, abstract & without implementation
-Used to achieve total abstraction
-Variables in the interface are final, public and static
*/

/*
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class king implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}

*/

class Main {

    public static void main(String args[]) {
        //Static Keyword - in java it is used to share the same variable or method of a given class.
        // Student s1 = new Student();
        // s1.schoolName = "SMT";
        
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);

        // Student s3 = new Student();
        // s3.schoolName = "ABC";

        // System.out.println(s1.schoolName);
        // System.out.println(s2.schoolName);

        Horse h = new Horse();
        System.out.println(h.color);
    }
}

// class Student {
//     static int returnPercentage(int math, int phy, int chem) {
//         return(math + phy + chem) / 3;
//     }

//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return this.name;
//     }
// }


/*Super Keyword - is used to refer immediate parent class object.
-to access parent's properties
-to access parent's functions
-to access parent's constructor
*/

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse () {
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}

//Constructor Chaining - Homework
//Note :- In java no class is private or protected, they can only bee public or default

/*
Remember this table :
            | private | default | protected | public
Class       |   No    |   Yes   |    No     |  Yes
Nested Class|   Yes   |   Yes   |    Yes    |  Yes
Constructor |   Yes   |   Yes   |    Yes    |  Yes
Method      |   Yes   |   Yes   |    Yes    |  Yes
Field       |   Yes   |   Yes   |    Yes    |  Yes
