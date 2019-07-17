package com.svinfotech.datastructures;

public class StackImpl {
	int top;
	int stackSize;
	int[] stackElemets;
	
	public StackImpl(int size) {
		this.stackSize = size;
		this.stackElemets = new int[size];
		this.top = -1;
	}
	
	public boolean isStackFull() {
		return (top == this.stackSize - 1);
	}
	
	public boolean isStackEmpty() {
		return (top == - 1);
	}

	public void push(int entry) throws Exception {
		if (this.isStackFull()) {
			throw new Exception("Stack OverFlow, You can't add element");
		} 
		System.out.println("Adding entry : " + entry);
		this.stackElemets[++top] = entry;
	}
	
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack Underflow, There are no elements in the stack so you can't delete entries");
		} 
		int entry = this.stackElemets[top--];
		System.out.println("Removed entry : " + entry);
		return entry;
	}
	
	public int peek() {
		return stackElemets[top];
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int topIndex = this.top;
		while (topIndex >= 0) {
			sb.append(this.stackElemets[topIndex]);
			sb.append(" \n");
			topIndex --;
		}
		System.out.println("Top Value : " + top + ", Top Index : " + topIndex);
		return sb.toString();
	}

	public static void main(String[] args) {
		StackImpl s = new StackImpl(10);
		try {
			System.out.println("Before puhsing what is the top ?" );
			System.out.println("Answer : Top = " + s.top);
			s.push(10);
			
			System.out.println("After puhsing first element what is the top ?" );
			System.out.println("Answer : Top = " + s.top);
			s.push(20);
			s.push(5);
			s.push(1);
			s.push(3);
			s.push(2);
			System.out.println(s.peek());
			
			s.push(33);
			System.out.println(s.peek());
			System.out.println("Top Value Before POP() : " + s.top);
			s.pop();
			System.out.println("Top Value After POP() : " + s.top);
			System.out.println("After POP() what is the top value : " + s.peek());
			s.push(11);
			s.push(23);
			s.push(44);
			s.push(45);
			//s.push(46); // Since we reached stack size , we will get stack overflow error.
			//s.push(47);
			//s.push(48);
			//s.push(49);
			//s.push(41);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
