package Collection;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// 1. Push
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		System.out.println(stack.get(0));		// 2출력 index를 통해 검색 가능
		
		// 2. Peek
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();
		
		// 3. search
		System.out.println(stack.search(7));		// 1출력   stack.get과는 다르게 사용하는 순서에 따라 숫자가 선정됨
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9));
		System.out.println();
		
		// 4. Pop
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		// boolean empty
		System.out.println(stack.empty());
	}
}
