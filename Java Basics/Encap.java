// #1 Using getter and setter methods

// class Person {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
// }

// public class Encap {
//     public static void main(String[] args) {
//         Person person = new Person();
//         person.setName("John");
//         person.setAge(25);

//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }

// #2 final class

final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encap {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// // #3 Constructor with parameter

// class BankAccount {
// private double balance;

// public BankAccount(double initialBalance) {
// this.balance = initialBalance;
// }

// public double getBalance() {
// return balance;
// }
// }

// public class Encap {
// public static void main(String[] args) {
// BankAccount account = new BankAccount(1000);
// System.out.println("Balance: " + account.getBalance());
// }
// }

// // #4 private methods

// class Calculator {
// private double add(double a, double b) {
// return a + b;
// }

// public double Func(double a, double b) {
// double result = add(a, b);
// System.out.println("Result: " + result);
// return result;
// }
// }

// public class Encap {
// public static void main(String[] args) {
// Calculator obj = new Calculator();
// obj.Func(5.5, 3.2);
// }
// }

// // #5 access modifiers

// class Bank {
// private double balance;

// void deposit(double amount) {
// if (amount > 0) {
// balance += amount;
// }
// }

// double getBalance() {
// return balance;
// }
// }

// public class Encap {
// public static void main(String[] args) {
// Bank bank = new Bank();
// bank.deposit(1000);
// System.out.println("Balance: " + bank.getBalance());
// }
// }