
// import java.util.HashSet;
// import java.util.TreeSet;
import java.util.LinkedHashSet;

// # 1HashSet

// public class SetMethods {
//     public static void main(String[] args) {
//         HashSet<String> hashSet = new HashSet<>();

//         // Adding elements
//         hashSet.add("Apple");
//         hashSet.add("Banana");
//         hashSet.add("Orange");

//         // Displaying elements
//         System.out.println("HashSet: " + hashSet);

//         // Removing an element
//         hashSet.remove("Banana");

//         // Checking if an element is present
//         boolean containsOrange = hashSet.contains("Orange");
//         System.out.println("Contains Orange: " + containsOrange);

//         // Size of the HashSet
//         int size = hashSet.size();
//         System.out.println("Size of HashSet: " + size);

//         // Clearing the HashSet
//         hashSet.clear();

//         // Checking if the HashSet is empty
//         boolean isEmpty = hashSet.isEmpty();
//         System.out.println("Is HashSet empty: " + isEmpty);
//     }
// }

// #2 TreeSet

// public class SetMethods {
//     public static void main(String[] args) {
//         TreeSet<Integer> treeSet = new TreeSet<>();

//         // Adding elements
//         treeSet.add(5);
//         treeSet.add(2);
//         treeSet.add(8);

//         // Displaying elements (naturally ordered)
//         System.out.println("TreeSet (Natural Order): " + treeSet);

//         // Removing an element
//         treeSet.remove(2);

//         // Checking if an element is present
//         boolean contains8 = treeSet.contains(8);
//         System.out.println("Contains 8: " + contains8);

//         // Size of the TreeSet
//         int size = treeSet.size();
//         System.out.println("Size of TreeSet: " + size);

//         // Clearing the TreeSet
//         treeSet.clear();

//         // Checking if the TreeSet is empty
//         boolean isEmpty = treeSet.isEmpty();
//         System.out.println("Is TreeSet empty: " + isEmpty);
//     }
// }

// #3 LinkedHashSet

public class SetMethods {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");

        // Displaying elements
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);

        // Removing element
        linkedHashSet.remove("Green");

        // If an element is present
        boolean containsBlue = linkedHashSet.contains("Blue");
        System.out.println("Contains Blue: " + containsBlue);

        // Size of LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Clearing the LinkedHashSet
        linkedHashSet.clear();

        // Checking if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty: " + isEmpty);
    }
}
