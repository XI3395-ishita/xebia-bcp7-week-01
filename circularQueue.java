package practice.queue;

import java.util.ArrayList;

public class circularQueue {
	private int size,front,rear;
	private ArrayList<Integer> queue= new ArrayList<Integer>();
	
	circularQueue(int size){
		this.size=size;
		this.front=this.rear=-1;
	}
	
	//insert element
	public void enQueue(int data) {
		if(((front==0) && rear== (size-1)) || (rear== (front-1) % (size-1))){
			System.out.println("Queue is full");
		}
		
		else if(front==-1) {
			front=0;
			rear=0;
			queue.add(rear,data);
		}
		
		else if(rear==size-1 && front!=0) {
			rear=0;
			queue.set(rear,data);
		}
		
		else {
			rear=(rear+1);
			
			if(front<=rear)
				queue.add(rear,data);
			else
				queue.set(rear, data);
		}
	}

	
	//remove element
	public int deQueue() {
		int temp;
		
		if(front==-1) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		temp=queue.get(front);
		
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else if(front==size-1)
			front=0;
		else
			front=front+1;
		return temp;

	}
	
	//display
	public void displayQueue() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("Elements are: ");
		
		if(rear>=front) {
			int i;
			for(i=front;i<=rear;i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		else {
			int i;
			for(i=front;i<size;i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			
			for(i=0;i<=rear;i++) {
				System.out.print(queue.get(i));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		circularQueue q=new circularQueue(4);
		
		q.enQueue(21);
		q.enQueue(23);
		q.enQueue(11);
		q.displayQueue();
		

	}

}
