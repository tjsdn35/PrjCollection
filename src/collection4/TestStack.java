package collection4;

import java.util.Stack;

public class TestStack {

	// Java 는 Stack을 class 로 만들어놓았다
	public static void main(String[] args) {
		Stack<String>  stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		String  st1 = stack.pop();
		String  st2 = stack.pop();
		String  st3 = stack.pop();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		

	}

}






