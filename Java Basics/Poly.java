// #1 Basic
// class Shape {
// public void area() {
// System.out.println("This func calculates area of shapes");
// }
// }

// class Square extends Shape {

// public void area(int side) {
// System.out.println(side * side);
// }
// }

// class Circle extends Shape {

// public void area(int r) {
// System.out.println(3.14 * r * r);
// }
// }

// public class Poly {

// public static void main(String[] args) {

// Square s1 = new Square();
// s1.area(5);

// Circle c1 = new Circle();
// c1.area(5);
// }

// }

// #2 Overridding

// class Programming {
// public void display() {
// System.out.println("Basic prog concepts");
// }
// }

// class Java extends Programming {
// @Override
// public void display() {
// System.out.println("Java8 Coding");
// }
// }

// class Poly {
// public static void main(String[] args) {

// Java j1 = new Java();
// j1.display();

// Programming l1 = new Programming();
// l1.display();
// }
// }

// #3 Overloading

// class Func {

// static int Multiply(int a, int b) {
// return a * b;
// }

// static double Multiply(double a, double b) {
// return a * b;
// }
// }

// class Poly {
// public static void main(String[] args) {
// System.out.println(Func.Multiply(2, 4));
// System.out.println(Func.Multiply(5.5, 6.3));
// }
// }

// #4 Operator Overloading

// class Poly {
// public static void main(String[] args) {
// int a = 5;
// int b = 6;

// int sum = a + b;

// String first = "Hello ";
// String second = "Rohan!";

// String name = first + second;

// System.out.println(sum);
// System.out.println(name);

// }
// }

// #5 Operator Overloading

// class Programming {
// public void display() {
// System.out.println("Basic Programming");
// }
// }

// class Java8 extends Programming {
// @Override
// public void display() {
// System.out.println("Object-Oriented Programming Language.");
// }
// }

// class Poly {
// public static void main(String[] args) {
// Programming pl;

// pl = new Programming();
// pl.display();

// pl = new Java8();
// pl.display();
// }
// }