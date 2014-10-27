package practical7;

public class VectorQueue<T> implements Queue<T> {
	
	private int front =0;
	private int rear=0;
	private int capacity=20;
	ArrayVector<T> queue = new ArrayVector<T>(capacity);
	
	public void enqueue(T value){
		queue.insertAtRank(queue.size, value);
	}

	public T dequeue(){
		T e= queue.removeAtRank(0);
		return e;
	}
	
	public T front(){
		return queue.elemAtRank(front);
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public int size(){
		return queue.size();
	}
	
	public String toString() {
		String out = queue.toString();
		return out;
	}
	
	public static void main(String[] args) {

		VectorQueue<Integer> test= new VectorQueue<Integer>();
		test.enqueue(10);
		System.out.println(test);
		test.enqueue(5);
		System.out.println(test);
		test.dequeue();
		System.out.println(test);
		test.enqueue(15);
		System.out.println(test);
		test.enqueue(3);
		System.out.println(test);
		test.dequeue();
		System.out.println(test);
		test.enqueue(7);
		System.out.println(test);
		test.dequeue();
		System.out.println(test);
		test.enqueue(20);
		System.out.println(test);
	}
}
