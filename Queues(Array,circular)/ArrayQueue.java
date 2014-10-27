package practical6;

public class ArrayQueue<T> implements Queue<T> {
	int size;
	int front;
	int rear = -1;
	T[] array = null;
	
	ArrayQueue(){
		 array = (T[])new Object[50];
	}
	ArrayQueue(int value){
		array = (T[])new Object[value];
	}
	
	public void enqueue(T value) {
		if(size < array.length){
			rear = (rear + 1) % (array.length);
			array[rear] = value;
			size ++;
		}
	}

	public T dequeue() {
		size--;
		T value = array[front];
		array[front++] = null;
		return value;
	}

	public T front() {
		
		return array[front];
	}

	public boolean isEmpty() {
		
		return size==0;
	}

	public int size() {
		return size;
	}
	public String toString() {
		String out = "[" + size + "] :";
		for (int i=0; i<array.length; i++) {
			out += array[i] + " ," ;
		}
		return out;
	}
	public static void main(String[] args) {
		ArrayQueue<String> ar =  new ArrayQueue<String>();
		ar.enqueue("A");
		ar.enqueue("P");
		ar.enqueue("E");
		System.out.println(ar);
		

	}


}
