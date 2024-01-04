// # ArrayList methods

import java.util.ArrayList;
// import java.util.LinkedList;

public class ListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding element
        arrayList.add("Rohan");
        arrayList.add("Harsh");
        arrayList.add("Dhruv");

        // Accessing element
        System.out.println("Elements in ArrayList: " + arrayList);

        // Modifying element
        arrayList.set(1, "Mahak");

        // Removing element
        arrayList.remove("Harsh");

        // Iterating over element
        System.out.println("Modified ArrayList: ");
        for (String language : arrayList) {
            System.out.println(language);
        }

        // Size of ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking ArrayList is empty or not
        System.out.println("ArrayList is empty - " + arrayList.isEmpty());
    }
}

// # LinkedList methods

// class ListMethods {
// public static void main(String[] args) {
// LinkedList<String> linkedList = new LinkedList<>();

// // Adding elements
// linkedList.add("Maths");
// linkedList.add("Physics");
// linkedList.add("Java");

// // Accessing element
// System.out.println("Elements are: " + linkedList);

// // Modifying element
// linkedList.set(1, "Chemistry");

// // Removing element
// linkedList.remove("Maths");

// // Iterating
// System.out.println("Modified LinkedList: ");
// for (String language : linkedList) {
// System.out.println(language);
// }

// // Size ofLinkedList
// System.out.println("Size : " + linkedList.size());

// // CheckingLinkedList is empty or not
// System.out.println("LinkedList is Empty -" + linkedList.isEmpty());
// }
// }
