package mod1_2.day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ColDemo3 {
	public static void main(String[] args) {
		Queue queue=new LinkedList();
		
		queue.add("num1");
		queue.add("num2");
		queue.add("num3");
		//queue follow first in first out
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println("num1 is removed so the first person in queue is..");
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());//returns the head of the queue
		
		//stack follows last in last out
		Stack stack=new Stack();
		stack.add("nummmm1");
		stack.add("nummmm2");
		stack.add("nummmm3");
		stack.add("nummmm4");
		
		System.out.println(stack.pop());//retreives the last one and deletes from the stack
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.push("num5555555");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		
	}
}