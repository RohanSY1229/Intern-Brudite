import java.util.*;
// import java.util.concurrent.ConcurrentHashMap;
// #1 HashMap

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding elements
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Accessing elements
        System.out.println("Value of 'Two': " + hashMap.get("Two"));

        // Removing elements
        hashMap.remove("Three");

        // Iterating over keys
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Checking if a key exists
        System.out.println("Contains key 'Two': " + hashMap.containsKey("Two"));

        // Checking if a value exists
        System.out.println("Contains value 3: " + hashMap.containsValue(3));

        // Size of the map
        System.out.println("Size of the map: " + hashMap.size());
    }
}

// // #2 Linked HashMap

// public class MapMethods {
// public static void main(String[] args) {
// // Creating a LinkedHashMap
// Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

// // Adding elements
// linkedHashMap.put("One", 1);
// linkedHashMap.put("Two", 2);
// linkedHashMap.put("Three", 3);

// // Accessing elements
// System.out.println("Value of 'Two': " + linkedHashMap.get("Two"));

// // Removing elements
// linkedHashMap.remove("Three");

// // Iterating over keys (maintains insertion order)
// for (String key : linkedHashMap.keySet()) {
// System.out.println("Key: " + key + ", Value: " + linkedHashMap.get(key));
// }

// // Checking if a key exists
// System.out.println("Contains key 'Two': " +
// linkedHashMap.containsKey("Two"));

// // Checking if a value exists
// System.out.println("Contains value 3: " + linkedHashMap.containsValue(3));

// // Size of the map
// System.out.println("Size of the map: " + linkedHashMap.size());
// }
// }

// // #3 TreeMap
// public class MapMethods {
// public static void main(String[] args) {
// // Creating a TreeMap
// Map<String, Integer> treeMap = new TreeMap<>();

// // Adding elements
// treeMap.put("One", 1);
// treeMap.put("Three", 3);
// treeMap.put("Two", 2);

// // Accessing elements (sorted order)
// System.out.println("Value of 'Two': " + treeMap.get("Two"));

// // Removing elements
// treeMap.remove("Three");

// // Replace values
// treeMap.replace("Two", 20);
// System.out.println("Updated TreeMap: " + treeMap);

// // Iterating over keys (sorted order)
// for (String key : treeMap.keySet()) {
// System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
// }

// // Checking if a key exists
// System.out.println("Contains key 'Two': " + treeMap.containsKey("Two"));

// // Checking if a value exists
// System.out.println("Contains value 3: " + treeMap.containsValue(3));

// // Size of the map
// System.out.println("Size of the map: " + treeMap.size());
// }
// }

// // #4 Concurrent HashMap

// public class MapMethods {
// public static void main(String[] args) {
// Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

// // Adding elements
// concurrentHashMap.put("One", 1);
// concurrentHashMap.put("Two", 2);
// concurrentHashMap.put("Three", 3);

// // Accessing elements
// System.out.println("Value of 'Two': " + concurrentHashMap.get("Two"));

// // Removing elements
// concurrentHashMap.remove("Three");

// // Iterating over keys
// concurrentHashMap.forEach((key, value) -> System.out.println("Key: " + key +
// ", Value: " + value));

// // Checking if a key exists
// System.out.println("Contains key 'Two': " +
// concurrentHashMap.containsKey("Two"));

// // Checking if a value exists
// System.out.println("Contains value 3: " +
// concurrentHashMap.containsValue(3));

// // Size of the map
// System.out.println("Size of the map: " + concurrentHashMap.size());

// // Additional methods
// concurrentHashMap.putIfAbsent("Four", 4);
// System.out.println("ConcurrentHashMap: " + concurrentHashMap);
// }
// }

// #5 HashTable

// public class MapMethods {
// public static void main(String[] args) {
// // Creating a HashTable
// Map<String, Integer> hashTable = new Hashtable<>();

// // Adding elements
// hashTable.put("One", 1);
// hashTable.put("Two", 2);
// hashTable.put("Three", 3);

// // Accessing elements
// System.out.println("Value of 'Two': " + hashTable.get("Two"));

// // Removing elements
// hashTable.remove("Three");

// // Iterating over keys
// for (String key : hashTable.keySet()) {
// System.out.println("Key: " + key + ", Value: " + hashTable.get(key));
// }

// // Checking if a key exists
// System.out.println("Contains key 'Two': " + hashTable.containsKey("Two"));

// // Checking if a value exists
// System.out.println("Contains value 3: " + hashTable.containsValue(3));

// // Compute a value
// hashTable.compute("Two", (key, value) -> value * 10);
// System.out.println("Computed HashTable: " + hashTable);

// // Size of the map
// System.out.println("Size of the map: " + hashTable.size());
// }
// }
