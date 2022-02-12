import java.io.*;
public class queue1 {
	static class Queue{
		static int a[];
		static int size;
		static int rear=-1;
	
	
	Queue(int n){
		a=new int[n];
		this.size=n;
			}
	
	
	
	public static boolean isEmpty() {
		return rear ==1;
	}
	
	//enqueue
	public static void add(int data) {
		if(rear == size-1) {
			System.out.println("full queue");
			return;
		}
		rear++;
		a[rear]=data;
	}
	
	//dequeue
	public static int remove() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		int front=a[0];
		int i;
		for(i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		rear--;
		return front;
	}
	
	//peek element
	public static int peek() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		return a[0];
		
	}
	}
	
	

	public static void main(String[] args) {
		Queue.v=new Queue(5);
		v.add(1);
		v.add(2);
		v.add(3);
		
		while(!v.isEmpty()) {
			System.out.println(v.peek());
			v.remove();
		}

	}

}
