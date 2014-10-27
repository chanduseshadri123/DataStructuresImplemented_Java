package practical3;
// Sai-keerthi-chandu Seshadri
// 13205471
public class W4Q5 {
	private Node top = null;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(Object object) {
		Node n = new Node(object);
		n.next = top;
		top = n;
		size++;
	}

	public Object top() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return top.element;
	}

	public Object pop() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		Object toReturn = top.element;
		top = top.next;
		size--;
		return toReturn;
	}

	private class Node {
		Object element;
		Node next;

		public Node(Object object) {
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
	void reverse(){
		for (int i = size; i > 0; i--) {
			System.out.println(pop());
		}
	}
	public static void main(String[] args) {
		W4Q5 rev = new W4Q5();
		rev.push('h');
		rev.push('a');
		rev.push('p');
		rev.push('p');
		rev.push('y');
		rev.reverse();
	}

}
