package main;

import java.util.Scanner;
import java.util.Stack;

public class main {
	public static void main (String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true;
			
			for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					isBalanced = false;
					break;
				}
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '['&& ch != ']') || (top == '{' && ch != '}' )) {
					boolean isBalnced = false;
					break;
				}
			}
		}
			
		if (isBalanced && stack.isEmpty()) {
			System.out.println("The Entered String has Balanced Brackets");
		} else {
			System.out.println("The Entered String is Unbalanced");
		}
	}
	catch (Exception e) {
		System.out.println();
	}
}