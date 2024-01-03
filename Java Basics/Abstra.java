// #1 Abstract Class

// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Draw a circle");
//     }
// }

// public class Abstra {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.draw();
//     }
// }

// #2 Abstract Methods

// abstract class Animal {
//     abstract void makeSound();
// }

// class Cat extends Animal {
//     void makeSound() {
//         System.out.println("Meow!");
//     }
// }

// public class Abstra {
//     public static void main(String[] args) {

//         Cat cat = new Cat();
//         cat.makeSound();
//     }
// }

// // #3 Abstraction usning Interfaces

// interface Shape {
//     void draw();
// }

// class Square implements Shape {
//     public void draw() {
//         System.out.println("Drawing a square");
//     }
// }

// public class Abstra {
//     public static void main(String[] args) {

//         Square square = new Square();
//         square.draw();
//     }
// }

// #4 Abstract class with concrete methods

// abstract class Car {
//     void start() {
//         System.out.println("Car started");
//     }

//     abstract void drive();
// }

// class Sedan extends Car {
//     void drive() {
//         System.out.println("Sedan is driving");
//     }
// }

// public class Abstra {
//     public static void main(String[] args) {
//         Sedan sedan = new Sedan();
//         sedan.start();
//         sedan.drive();
//     }
// }

// #5

abstract class Shape {
    int sides;

    Shape(int sides) {
        this.sides = sides;
    }

    abstract void draw();
}

class Triangle extends Shape {
    Triangle() {
        super(3);
    }

    void draw() {
        System.out.println("Drawing a triangle with " + sides + " sides");
    }
}

public class Abstra {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
