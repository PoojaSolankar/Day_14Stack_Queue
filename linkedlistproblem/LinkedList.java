package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node top;
	int size = 0;
	
	public void push(int data)        
    {
		Node newNode = new Node(data);
       if (newNode == null)
        {
            System.out.println("stack Overflow");
            return;
        }else {
 
        	System.out.println("Insert " + data);
        	newNode.next = top;
        	top = newNode;
        	size ++;
        }
    }
	
	public void display() {
			Node temp = top;
			while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
	}
}
	


