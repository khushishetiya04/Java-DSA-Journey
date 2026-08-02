/*
 * Topic: Reverse String using Stack
 *
 * Description:
 * Reverse a string using the LIFO property
 * of a Stack.
 *
 * Algorithm:
 * 1. Push every character of the string.
 * 2. Pop all characters one by one.
 * 3. The popped characters form the reversed string.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;
public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();

        // Pop all characters
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "STACK";

        System.out.println("Original String : " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}