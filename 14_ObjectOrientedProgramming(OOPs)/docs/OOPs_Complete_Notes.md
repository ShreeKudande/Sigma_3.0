# Java OOPs Complete Notes

This file is a complete, simple, and detailed guide to Object-Oriented Programming in Java.

If you read this carefully, you will understand not only the theory but also how to apply OOP in real Java programs.

---

## 1. What is OOP?

Object-Oriented Programming (OOP) is a way of writing programs by organizing code into classes and objects.

Instead of writing everything in one big program, we break the problem into small reusable pieces.

### Why OOP is important
- Makes code reusable
- Easier to maintain
- Easier to understand
- Helps in building large applications
- Encourages clean design

### Real-life analogy
Think of a class as a blueprint, and an object as the actual item made from that blueprint.

Example:
- Class: `Car`
- Object: `BMW`, `Audi`, `Tesla`

---

## 2. Class and Object

### Class
A class is a blueprint or template.

It defines:
- Attributes (data)
- Methods (behavior)

### Object
An object is a real instance of a class created in memory.

### Example
```java
class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.marks = 95;
        s1.display();
    }
}
```

### Output
```text
Name: Aman
Marks: 95
```

### Important points
- `class` defines the structure
- `new` creates an object
- Each object gets its own memory

---

## 3. Fields, Methods, and Variables

### Fields (Attributes)
Fields are variables declared inside a class.

```java
class Person {
    String name;
    int age;
}
```

### Methods
Methods are functions inside a class.

```java
class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}
```

### Types of variables in Java
1. Local variables
   - Declared inside methods
2. Instance variables
   - Declared inside class, outside methods
3. Static variables
   - Shared by all objects of the class

---

## 4. Encapsulation

Encapsulation means wrapping data and methods together in a class and hiding the internal details.

### Why encapsulation is useful
- Protects data
- Prevents accidental modification
- Improves control over data

### Example
```java
class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setMarks(98);

        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}
```

### Important idea
Private fields cannot be accessed directly from outside the class.

So we use:
- Getter methods
- Setter methods

This is called data hiding.

---

## 5. Inheritance

Inheritance means one class acquires properties and methods of another class.

### Syntax
```java
class Parent {
    // parent class
}

class Child extends Parent {
    // child class
}
```

### Example
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}
```

### Output
```text
Vehicle started
Car is driving
```

### Types of inheritance in Java
Java supports:
- Single inheritance
- Multilevel inheritance
- Hierarchical inheritance

Java does not support multiple inheritance using classes directly.

### Uses of inheritance
- Code reuse
- Relationship between classes
- Building class hierarchy

---

## 6. Polymorphism

Polymorphism means "many forms".

In Java, polymorphism happens in two ways:
1. Compile-time polymorphism
2. Runtime polymorphism

### 6.1 Method Overloading (Compile-time Polymorphism)
Same method name, different parameters.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
    }
}
```

### 6.2 Method Overriding (Runtime Polymorphism)
Child class provides its own version of a method already present in parent class.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

### Output
```text
Dog barks
```

### Important rule
The object type is `Dog`, but reference type is `Animal`.

Java decides the method at runtime, so this is called runtime polymorphism.

---

## 7. Abstraction

Abstraction means hiding unnecessary implementation details and showing only the important features.

### Example of abstraction
When you drive a car, you do not care about engine internals.

You only use:
- Start button
- Steering wheel
- Brake

### Ways to achieve abstraction in Java
1. Abstract class
2. Interface

### 7.1 Abstract class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
```

### 7.2 Interface
Interface is completely abstract.

```java
interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
```

### Difference between abstract class and interface
- Abstract class can have both abstract and non-abstract methods
- Interface only has abstract methods (before Java 8)
- A class can extend one abstract class but implement many interfaces

---

## 8. Constructors

A constructor is a special method used to initialize an object.

### Important facts
- Constructor name is same as class name
- No return type
- Called automatically when object is created

### Example
```java
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Java OOP");
        b.display();
    }
}
```

### Types of constructors
1. Default constructor
2. Parameterized constructor

### Default constructor
```java
class Demo {
    Demo() {
        System.out.println("Default constructor");
    }
}
```

---

## 9. this keyword

`this` refers to the current object.

### Example
```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

### Uses of `this`
- Differentiate between instance variable and parameter
- Call another constructor
- Pass current object

---

## 10. super keyword

`super` is used to access parent class members.

### Example
```java
class Animal {
    String color = "Brown";
}

class Dog extends Animal {
    void display() {
        System.out.println("Color: " + super.color);
    }
}
```

### Uses of `super`
- Access parent variables
- Call parent constructor
- Access parent methods

---

## 11. static keyword

`static` means shared by all objects of the class.

### Example
```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count);
    }
}
```

### Output
```text
2
```

### Static members can be accessed using:
- Class name
- Or object reference

### Static methods
A static method belongs to the class, not the object.

```java
class MathHelper {
    static int square(int x) {
        return x * x;
    }
}
```

### Important note
Static methods cannot access instance variables directly.

---

## 12. final keyword

`final` is used to restrict changes.

### Uses
- Final variable: cannot be changed
- Final method: cannot be overridden
- Final class: cannot be inherited

### Example
```java
class Demo {
    final int x = 10;

    final void show() {
        System.out.println("Final method");
    }
}
```

---

## 13. Access Modifiers

Access modifiers decide visibility of class members.

### Types
1. `private`
2. `default` (package-private)
3. `protected`
4. `public`

### Table
| Modifier | Class | Package | Subclass | World |
|---------|-------|---------|----------|-------|
| private | Yes | No | No | No |
| default | Yes | Yes | No | No |
| protected | Yes | Yes | Yes | No |
| public | Yes | Yes | Yes | Yes |

### Example
```java
class A {
    private int x = 10;
    int y = 20;
    protected int z = 30;
    public int p = 40;
}
```

---

## 14. Packages

A package is a grouping of related classes.

### Why packages are used
- Organize code
- Avoid name conflicts
- Better project structure

### Example
```java
package mypack;

public class Demo {
    public void show() {
        System.out.println("Hello from package");
    }
}
```

### Importing package
```java
import mypack.Demo;
```

---

## 15. Interfaces

An interface is a completely abstract type.

It is used to define a contract.

### Example
```java
interface Printable {
    void print();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing...");
    }
}
```

### Features of interfaces
- Can have abstract methods
- Can have default methods
- Can have static methods
- Supports multiple inheritance

### Example with multiple inheritance
```java
interface A {
    void a();
}

interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("A");
    }

    public void b() {
        System.out.println("B");
    }
}
```

---

## 16. Composition and Aggregation

These are ways of building relationships between objects.

### Aggregation
A has-a relationship where one object uses another, but both can exist independently.

```java
class Engine {
    String type;
}

class Car {
    Engine engine;
}
```

### Composition
A stronger form of ownership.

```java
class Heart {
}

class Human {
    Heart heart = new Heart();
}
```

### Key difference
- Aggregation: parts can exist independently
- Composition: part belongs to the whole

---

## 17. Object Creation and Memory

When you write:
```java
Student s = new Student();
```

Java does this:
1. Allocates memory for the object
2. Calls constructor
3. Returns reference `s`

### Memory regions in Java
- Stack: stores local variables and references
- Heap: stores actual objects
- Method area: stores class information

---

## 18. Method Overloading vs Method Overriding

### Overloading
Same method name, different parameters.

```java
class Test {
    void show(int x) {}
    void show(String x) {}
}
```

### Overriding
Same method signature in subclass and parent.

```java
class Parent {
    void show() { }
}

class Child extends Parent {
    @Override
    void show() { }
}
```

---

## 19. instanceof keyword

Used to check whether an object is an instance of a class or interface.

```java
class Animal {}
class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Dog);
    }
}
```

### Output
```text
true
```

---

## 20. Common OOP Interview Questions

### Q1. What is a class?
A class is a blueprint from which objects are created.

### Q2. What is an object?
An object is an instance of a class.

### Q3. What is encapsulation?
Wrapping data and methods together and hiding internal details.

### Q4. What is inheritance?
A child class acquires properties and methods of a parent class.

### Q5. What is polymorphism?
Many forms of behavior based on context.

### Q6. What is abstraction?
Showing only necessary details and hiding implementation.

---

## 21. Important OOP Rule of Thumb

Remember this:

- A class describes what an object is
- An object is the actual thing created from the class
- Encapsulation protects data
- Inheritance allows reuse
- Polymorphism allows flexibility
- Abstraction simplifies complexity

---

## 22. Mini Real Example

```java
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int marks;

    public Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    public void displayStudent() {
        display();
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Aman", 20, 95);
        s.displayStudent();
    }
}
```

### Output
```text
Name: Aman
Age: 20
Marks: 95
```

This example combines:
- Encapsulation
- Inheritance
- Constructor
- super keyword
- Method use

---

## 23. Common Mistakes Students Make

### Mistake 1: Using `this` incorrectly
```java
Student(String name) {
    name = name; // wrong
}
```

Correct:
```java
Student(String name) {
    this.name = name;
}
```

### Mistake 2: Accessing private variables directly
```java
s.name = "Aman"; // wrong if name is private
```

Correct:
```java
s.setName("Aman");
```

### Mistake 3: Confusing method overloading and overriding
- Overloading: same name, different parameters
- Overriding: same method in subclass

### Mistake 4: Forgetting `@Override`
This is optional, but recommended.

---

## 24. Quick Revision Cheat Sheet

### Class
A template for creating objects.

### Object
An instance of a class.

### Encapsulation
Data + methods + hiding details.

### Inheritance
Child gets properties of parent.

### Polymorphism
Same action, different behavior.

### Abstraction
Hide complicated details.

### Constructor
Initializes object.

### `this`
Current object.

### `super`
Parent class reference.

### `static`
Shared across all objects.

### `final`
Cannot be changed.

---

## 25. Final Summary

Java OOP is all about creating programs using real-world ideas:
- Classes define structure
- Objects represent real entities
- Encapsulation protects data
- Inheritance promotes reuse
- Polymorphism allows flexibility
- Abstraction simplifies complexity

If you understand these 6 pillars well, you are already on the path to becoming strong in Java programming.

---

## 26. Practice Tip

Try making these small projects:
1. Student management system
2. Bank account system
3. Library management system
4. Car parking system
5. Employee records system

Each project will help you apply OOP concepts in real life.

---

## 27. One-line OOP Formula

OOP = Classes + Objects + Encapsulation + Inheritance + Polymorphism + Abstraction

---

# End of Notes

If you practice these concepts with examples, you will become comfortable with Java OOP very quickly.
