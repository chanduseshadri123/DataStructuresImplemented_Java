package practical5;

public class LinkedQueque<T> implements Queue<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	public void enqueue(T value) {
		if(front == null){
			Node<T> n = new Node<T>(value);
			front = n;
			rear = n;
			front.next = null;
			size++;
		}
		else{
			Node<T> n = new Node<T>(value);
			rear.next = n;
			rear = n;
			rear.next = null;
			size++;
		}
	}
	public static void main(String[] args) {
		LinkedQueque<Object> que = new LinkedQueque<Object>();
		que.enqueue('A');
		que.enqueue('P');
		que.enqueue('E');
		System.out.println(que);

	}
	public T dequeue() {
		if(front == null){
			
		}
		Node<T> temp;
		temp = front;
		front = front.next;
		T value = temp.element;
		temp.next = null;
		size--;
		return value;
	}
	public T front() {
		
		return front.element;
	}
	public boolean isEmpty() {
		if(front == null)
			return true;
		else
			return false;
	}
	public int size() {
		
		return size;
	}
	public String toString() {
		String out = "[" + size + " element(s)]: ";
		Node<T> n = front;
		while (n != null) {
			out += "[" + n.element + "|-]-> ";
			n = n.next;
		}
		return out;
	}
	class Node<T>{
		T element;
		Node<T> next;
		Node(T value){
			element = value;
		}
	}

}
