package generic;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Aasd");
        stack.push("Basdf");
        stack.push("Casd");
        stack.push("Dasd");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop()); // Забирает последний элемент
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
