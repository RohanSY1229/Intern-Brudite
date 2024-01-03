import java.util.*;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue operation
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Dequeue operations
        System.out.println("Remove: " + queue.poll()); // Removes and returns the front element

        // Peek at the front element
        System.out.println("Peek: " + queue.peek());

        // Checking if the queue is empty
        System.out.println("Is empty: " + queue.isEmpty());

        // Size of the queue
        System.out.println("Size: " + queue.size());
    }
}
