import java.util.Stack;

public class Stk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping element
        System.out.println("Pop: " + stack.pop()); // Removes and returns the top element

        // Peeking at the top element without removing
        System.out.println("Peek: " + stack.peek());

        // If the stack is empty
        System.out.println("Is empty: " + stack.isEmpty());

        // Size ofstack
        System.out.println("Size: " + stack.size());
    }
}
