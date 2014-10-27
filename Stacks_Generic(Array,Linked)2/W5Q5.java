package practical4;
//Sai-keerthi-chandu Seshadri
//13205471
import practical3.StackEmptyException;

public class W5Q5<T> implements Stack<T> {
	private Node top = null;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(T object) {
		Node n = new Node(object);
		n.next = top;
		top = n;
		size++;
	}

	public T top() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return top.element;
	}

	public T pop() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		T toReturn = top.element;
		top = top.next;
		size--;
		return toReturn;
	}

	private class Node {
		T element;
		Node next;

		public Node(T object) {
			element = object;
		}
	}

	public String toString() {

		String out = "[" + size + " element(s)]: ";
		Node n = top;
		while (n != null) {
			out += "[" + n.element + "|-]-> ";
			n = n.next;
		}
		return out;
	}

	public void reverse() {
		for (int i = size; i > 0; i--) {
			System.out.println(pop());
		}
	}

	public static void main(String[] args) {
		W5Q5<Character> rev = new W5Q5<Character>();
		rev.push('h');
		rev.push('a');
		rev.push('p');
		rev.push('p');
		rev.push('y');
		rev.reverse();
	}

}
