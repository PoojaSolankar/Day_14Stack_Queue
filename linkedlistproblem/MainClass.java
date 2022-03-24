package com.Bridgelabz.linkedlistproblem;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println(" Welcome to LinkedList Program");
		
	    //LinkedList linkedlist = new LinkedList();
		
	    Queue queue = new Queue();
	    queue.enqueue(70);
	    queue.enqueue(30);
	    queue.enqueue(56);
	    queue.display(); 
	    
	    System.out.println("\n");
	    queue.dequeue();
	    queue.display();
	    
	    System.out.println("\n");
	    System.out.println("Check queue is empty or not:" +queue.isEmpty());
	    System.out.println("Front of queue is: " +queue.peek());
	    System.out.println("size of queue is:" +queue.size());
	 }
}
