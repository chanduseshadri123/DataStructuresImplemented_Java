package practical8;

public class LinkedList<T> implements List<T> {
	private class Node implements Position<T> {
		T element;
		Node next, prev;
		public Position<T> front;

		public Node(T element) {
			this.element = element;
		}

		@Override
		public T element() {
			return element;
		}
	}

	Node front, rear;
	int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<T> first() {
		if (front == null)
			throw new ListEmptyException();
		return front;
	}

	@Override
	public Position<T> last() {
		if (rear == null)
			throw new ListEmptyException();
		return rear;
	}

	@Override
	public Position<T> prev(Position<T> p) {
		return ((Node) p).front;
	}

	@Override
	public Position<T> next(Position<T> p) {
		return ((Node) p).next;
	}

	@Override
	public Position<T> insertFirst(T e) {
		Node n = new Node(e);
		if (front == null) {
			rear = n;
			front = n;
			front.prev = null;
			front.next = null;
		} else {
			n.next = front;
			front.prev = null;
		}
		front = n;
		size++;
		return n;
	}

	public Position<T> insertLast(T e) {
		Node n = new Node(e);
		if (rear == null) {
			rear = front = n;
			rear.next = rear.prev = null;
		} else {
			rear.next = n;
			n.prev = rear;
			rear = n;
		}
		size++;
		return rear;
	}

	@Override
	public Position<T> insertBefore(Position<T> p, T e) {

		if (p == rear)
			return insertLast(e);

		Node node = (Node) p;
		Node n = new Node(e);
		n.next = node.next;
		n.prev = node;
		node.next.prev = n;
		node.next = n;
		size++;

		return n;
	}

	@Override
	public Position<T> insertAfter(Position<T> p, T e) {
		if (p == rear)
			return insertLast(e);

		Node node = (Node) p;

		Node n = new Node(e);
		n.next = node.next;
		n.prev = node;
		node.next.prev = n;
		node.next = n;
		size++;
		return n;
	}

	@Override
	public T replace(Position<T> p, T e) {
		Node node = (Node) p;
		T f = node.element;
		node.element = e;
		return f;
	}

	@Override
	public T remove(Position<T> p) {
		Node node = (Node) p;
		T value = null;
		if (p == front) {
			if (front == rear) { 
				value = front.element;
				front = rear = null;
			} else {
				front = front.next;
				front.prev.next = null;
				front.prev = null;
				value = node.element;
				node = null;
		}
		} else if (p == rear) {
			rear = rear.prev;
			rear.next = null;
			rear.next.prev = null;
		} else {
			node.next.prev = node.prev;
			node.prev.next = node.next;
			node.next = null;
			node.prev = null;
		}
		size--;
		return value;
	}

	public String toString() {
		String out = "[" + size + "]: ";
		Node n = front;
		while (n != null) {
			if (n.next == null) {
				return out += "\"" + n.element + "\"";
			}
			out += "\"" + n.element + "\"" + ",";
			n = n.next;

		}
		return out;

	}

	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<Character>();

		list.insertLast('A');
		list.insertLast('P');
		list.insertLast('E');

		System.out.println(list);
	}
}
