import java.io.*;
import java.util.*;

public class stack1 {
	//push
	static void stack_push(Stack<Integer> stack) {
		int i=0;
		for(i=0;i<3;i++) {
			stack.push(i);
		}
	}
	
	//pop
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop operation:");
		int i;
		for(i=0;i<3;i++) {
			Integer x=(Integer) stack.pop();
			System.out.println(x);
		}
	}
	
	//top element
	static void stack_peek(Stack<Integer> stack) {
		System.out.println("Element on top:");
		Integer e=(Integer) stack.peek();
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);

  }
}
