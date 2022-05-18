package DataStructure;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		StackTest stacktest=new StackTest();
		
		stacktest.push("A");
		stacktest.push("B");
		stacktest.push("C");
		
		System.out.println(stacktest.pop());
		System.out.println(stacktest.pop());
		System.out.println(stacktest.pop());
		System.out.println(stacktest.pop());

		Stack<String> stack=new Stack<String>();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		for(;;) {
			for(int i=0; i<stack.size();i++) {
				System.out.print(stack.get(i)+" ");
			}
			System.out.println();
			stack.pop();
			if(stack.size()==0) {
				break;
			}
		}
	}
}
