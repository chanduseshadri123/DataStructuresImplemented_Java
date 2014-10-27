package practical8;

public class Lists<T> implements List<T> {
	int size;
	Node<T> first;
	Node<T> last;
	
	class Node<T> implements Position<T>{
		T element;
		Node<T> next;
		Node<T> previous;
		Node(T value){
			element =  value;
		}
		public T element(){
			return element;
		}
	}

	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public Position<T> first() {
		
		return first;
	}

	@Override
	public Position<T> last() {
		
		return last;
	}

	@Override
	public Position<T> prev(Position<T> p) {
		
		return ((Node) p).previous;
	}

	@Override
	public Position<T> next(Position<T> p) {
		
		return ((Node) p).next;
	}

	@Override
	public Position<T> insertFirst(T e) {
		Node<T> n = new Node<T>(e);
		n.next = first;
		first.previous = n;
		n.previous = null;
		first = n;
		first.element = e;
		return null;
	}

	@Override
	public Position<T> insertLast(T e) {
		Node<T> n = new Node<T>(e);
		n.next = null;
		n.previous = last;
		last.next = n;
		last = n;
		
		return null;
	}

	public Position<T> insertBefore(Position<T> p, T e) {
		Node<T> n = new Node<T>(e);
		Node<T> node = (Node<T>) p;
		n.next = node;
		n.previous = node.previous;
		node.previous.next = n;
		node.previous = n;
		
		return null;
	}

	
	public Position<T> insertAfter(Position<T> p, T e) {
		Node<T> n = new Node<T>(e);
		Node<T> node = (Node<T>) p;
		node.next.previous = n;
		n.next = node.next;
		n.previous = node;
		node.next = n;
		
		
		return null;
	}

	public T replace(Position<T> p, T e) {
		Node<T> node = (Node<T>) p;
		node.element = e;
		return e;
	}

	public T remove(Position<T> p) {
		Node<T> node = (Node<T>) p;
		T value = node.element;
		node.previous.next = node.next;
		node.next.previous = node.previous;
		node.next = null;
		node.previous = null;
		return value;
	}

	
	
}
