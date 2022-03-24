package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node top;
	int size = 0;
	
	public void push(int data) {
		Node newNode = new Node(data);
       if (newNode == null) {
            System.out.println("stack Overflow");
            return;
        }else {
 
        	System.out.println("Insert " + data);
        	newNode.next = top;
        	top = newNode;
        	size ++;
        }
    }
	
	public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        	int result = top.data;
        	System.out.println("\n");
        	System.out.println("Removing " + result);
        	top = top.next;
        	size--;
        	return result;
     }
    
    public boolean isEmpty() {
    		return size == 0;
    }
    
	public int peek() {
        if(isEmpty()) {
        	System.out.println("The stack is empty");
        }
        	return top.data;
    }
 
    public int size() {
        	return size;
    }  
	
	public void display() {
			Node temp = top;
			while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
	}
}
	


