/**
 * 
 */
package datastructures;

/**
 * @author Ananda Magar
 *
 * @date Sep 29, 2022
 */
public class StackImplementationUsingArray {
	int topIndex = -1;
	int arrayCapacity = 5;
	int[] stackArray = new int[arrayCapacity];
	
	
	public boolean isEmpty() {
		return topIndex < 0;
	}
	
	public boolean isFull() {
		return topIndex == arrayCapacity - 1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			stackArray[++topIndex] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		return stackArray[topIndex--];
	}
	
	public void display() {
		for(int i = 0; i < stackArray.length; i++) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		System.out.println(stackArray[topIndex]);
	}
	public static void main(String[] args) {
		StackImplementationUsingArray siua = new StackImplementationUsingArray();
		siua.push(1);
		siua.push(3);
		siua.push(5);
		siua.push(7);
		siua.push(8);
		siua.pop();
		
		
		siua.display();
		siua.peek();
		
	}

}
