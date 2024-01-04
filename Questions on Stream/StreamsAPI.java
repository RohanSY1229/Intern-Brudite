import java.util.*;
// import java.util.stream.Stream;
import java.util.stream.Collectors;

// #1 Create a Dummy List, Map, and Set for Stream:

// public class StreamsAPI {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add("apple");
//         list.add("banana");
//         list.add("orange");

//         List<String> dummyList = list.stream()
//                 .map(String::toUpperCase)
//                 .collect(Collectors.toList());

//         Map<Integer, String> dummyMap = list.stream()
//                 .collect(Collectors.toMap(String::length, String::toUpperCase));

//         Set<String> dummySet = list.stream()
//                 .map(String::toUpperCase)
//                 .collect(Collectors.toSet());

//         System.out.println("Dummy List: " + dummyList);
//         System.out.println("Dummy Map: " + dummyMap);
//         System.out.println("Dummy Set: " + dummySet);
//     }
// }

// #2 Find the First Non-Repeated Character in a String using Stream Functions

// public class StreamsAPI {
// public static void main(String[] args) {
// String input = "programming";

// char firstNonRepeatedChar = input.chars()
// .mapToObj(c -> (char) c)
// .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
// .findFirst()
// .orElseThrow(() -> new RuntimeException("No non-repeated character found."));

// System.out.println("First non-repeated character: " + firstNonRepeatedChar);
// }
// }

// #3 Find the First Repeated Character in a String using Stream Functions
// public class StreamsAPI {
// public static void main(String[] args) {
// String input = "programming";

// char firstRepeatedChar = input.chars()
// .mapToObj(c -> (char) c)
// .filter(ch -> input.indexOf(ch) != input.lastIndexOf(ch))
// .findFirst()
// .orElseThrow(() -> new RuntimeException("No repeated character found."));

// System.out.println("First repeated character: " + firstRepeatedChar);
// }
// }

// #4 Sort all Values in a List of Integers using Stream Functions:

// public class StreamsAPI {
// public static void main(String[] args) {
// List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

// List<Integer> sortedNumbers = numbers.stream()
// .sorted()
// .collect(Collectors.toList());

// System.out.println("Sorted numbers: " + sortedNumbers);
// }
// }

// #5 Concatenate Two Stream

// public class StreamsAPI {
// public static void main(String[] args) {
// List<String> stream1 = Arrays.asList("one", "two", "three");
// List<String> stream2 = Arrays.asList("four", "five", "six");

// List<String> concatenatedList = Stream.concat(stream1.stream(),
// stream2.stream())
// .collect(Collectors.toList());

// System.out.println("Concatenated List: " + concatenatedList);
// }
// }

// #6 Convert List of Objects into a Map with Sorted Order for Duplicated Keys

// class Student {
// private int id;
// private String name;

// public Student(int id, String name) {
// this.id = id;
// this.name = name;
// }

// public int getId() {
// return id;
// }

// public String getName() {
// return name;
// }
// }

// public class StreamsAPI {
// public static void main(String[] args) {
// List<Student> students = Arrays.asList(
// new Student(1, "Rohan"),
// new Student(2, "Josh"),
// new Student(1, "Harsh"),
// new Student(3, "Shitij"));

// Map<Integer, String> studentMap = students.stream()
// .collect(Collectors.toMap(
// Student::getId,
// Student::getName,
// (existing, replacement) -> existing + ", " + replacement,
// TreeMap::new));

// System.out.println("Map: " + studentMap);
// }
// }

// #7 Count Each Element/Word in a String ArrayList
// public class StreamsAPI {
// public static void main(String[] args) {
// List<String> words = Arrays.asList("apple", "banana", "apple", "orange",
// "banana", "apple");

// Map<String, Long> wordCount = words.stream()
// .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

// System.out.println("Word count: " + wordCount);
// }
// }

// #8 Find Only Duplicate Elements with Their Count from the String ArrayList

public class StreamsAPI {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange",
                "banana", "apple");

        Map<String, Long> duplicateWordCount = words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate word count: " + duplicateWordCount);
    }
}

// #9 Find the Maximum Element in an Array

// public class StreamsAPI {
// public static void main(String[] args) {
// int[] numbers = { 3, 1, 4, 1, 5, 6, 5, 3, 5 };

// int maxNumber = Arrays.stream(numbers)
// .max()
// .orElseThrow(() -> new RuntimeException("Array is empty."));

// System.out.println("Maximum number: " + maxNumber);
// }
// }

// // #10 Print the Count of Each Character in a String

// public class StreamsAPI {
// public static void main(String[] args) {
// String inputString = "palindrome";

// Map<Character, Long> charCount = inputString.chars()
// .mapToObj(c -> (char) c)
// .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

// System.out.println("Character count: " + charCount);
// }
// }
