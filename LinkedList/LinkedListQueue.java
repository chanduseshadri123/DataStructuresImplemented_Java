package practical8;

import practical7.Queue;

public class LinkedListQueue <T> implements Queue<T> { 
		LinkedList<T> queue = new LinkedList<T>();
		
	public int size() {
		return queue.size();
	}
		public boolean isEmpty() {
			return queue.isEmpty();
		}
		public T front() {
			return queue.first().element();
		}
		public void enqueue(T value) {
			queue.insertLast(value);
		}
		public T dequeue() {
			return queue.remove(queue.front);
		}
		public String toString() {
			
			return queue.toString();
		}

	public static void main(String[] args) {
		LinkedListQueue<Integer> queue= new LinkedListQueue<Integer>();
		
		
		queue.enqueue(10);
		System.out.println(queue);
		
		queue.enqueue(5);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(15);
		System.out.println(queue);
		
		queue.enqueue(3);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(7);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(20);
		System.out.println(queue);
		
		int total=0;
		
		while (!queue.isEmpty()) {
			total = total + queue.dequeue();
		}
		System.out.println("The total is: "+total);	
	}

	}


