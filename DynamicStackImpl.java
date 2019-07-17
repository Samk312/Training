package com.svinfotech.datastructures;

public class DynamicStackImpl {
	
	private int top;
	private int stackSize;
	private int[] stackElemets;
	
	DynamicStackImpl(int size) {
		this.stackSize = size;
		this.stackElemets = new int[this.stackSize];
		this.top = -1;
	}
	
	public boolean isStackFull() {
		return (top == this.stackSize-1);
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println("Stack is full, increasing the capacity to double");
			this.increaseCapacity();
		} 
		this.stackElemets[++top] = entry;
	}
	
	public void increaseCapacity() {
		int[] newStackArray = new int[this.stackSize*2];
		for (int i=0; i<this.stackSize; i++) {
			newStackArray[i] = this.stackElemets[i];
		}
		this.stackSize = this.stackSize*2;
		this.stackElemets = newStackArray;
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
		DynamicStackImpl dynamicStack = new DynamicStackImpl(10);
		try {
			System.out.println("Before puhsing what is the top ?" );
			System.out.println("Answer : Top = " + dynamicStack.top);
			dynamicStack.push(10);
			
			System.out.println("After puhsing first element what is the top ?" );
			System.out.println("Answer : Top = " + dynamicStack.top);
			dynamicStack.push(20);
			dynamicStack.push(5);
			dynamicStack.push(1);
			dynamicStack.push(3);
			dynamicStack.push(2);
			System.out.println(dynamicStack.peek());
			
			dynamicStack.push(33);
			System.out.println(dynamicStack.peek());
			System.out.println("Top Value Before POP() : " + dynamicStack.top);
			dynamicStack.pop();
			System.out.println("Top Value After POP() : " + dynamicStack.top);
			System.out.println("After POP() what is the top value : " + dynamicStack.peek());
			dynamicStack.push(11);
			dynamicStack.push(23);
			dynamicStack.push(44);
			dynamicStack.push(45);
			dynamicStack.push(46); 
			// Since we reached stack size , we won't get stack overflow error.
			// Because we increased the array .
			dynamicStack.push(47);
			dynamicStack.push(48);
			dynamicStack.push(49);
			dynamicStack.push(41);
			System.out.println(dynamicStack);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
