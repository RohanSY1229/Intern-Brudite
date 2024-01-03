// #1 Single
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class Inher {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();
//         dog.bark();
//     }
// }

// // // #2 multilevel

// class A {
//     void methodA() {
//         System.out.println("Method A");
//     }
// }

// class B extends A {
//     void methodB() {
//         System.out.println("Method B");
//     }
// }

// class C extends B {
//     void methodC() {
//         System.out.println("Method C");
//     }
// }

// public class Inher {
//     public static void main(String[] args) {
//         C c = new C();
//         c.methodA();
//         c.methodB();
//         c.methodC();
//     }
// }

// // #3 Hierarchical

// class Shape {
//     void draw() {
//         System.out.println("Drawing shape");
//     }
// }

// class Circle extends Shape {
//     void drawCircle() {
//         System.out.println("Drawing circle");
//     }
// }

// class Square extends Shape {
//     void drawSquare() {
//         System.out.println("Drawing square");
//     }
// }

// public class Inher {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.draw();
//         circle.drawCircle();

//         Square square = new Square();
//         square.draw();
//         square.drawSquare();
//     }
// }

// // #4 Hybrid

// interface Engine {
// void start();
// }

// class Vehicle {
// void display() {
// System.out.println("Vehicle details");
// }
// }

// class Car extends Vehicle implements Engine {
// public void start() {
// System.out.println("Car started");
// }
// }

// public class Inher {
// public static void main(String[] args) {
// Car car = new Car();
// car.display();
// car.start();
// }
// }

// // #5 Multiple

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Inher {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
        c.methodB();
    }
}
