package practical4;
//Sai-keerthi-chandu Seshadri
//13205471
import practical3.StackEmptyException;
import practical3.StackFullException;

public class ArrayStack<T> implements Stack<T> {
	int top;
	@SuppressWarnings("unchecked")
	T[] arr = (T[]) new Object[20];

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public T pop() {
		if (top == 0)
			throw new StackEmptyException();

		return arr[--top];
	}

	public void push(T object) {
		if (top == arr.length)
			throw new StackFullException();
		arr[top++] = object;
	}

	public T top() {
		if (top == 0)
			throw new StackEmptyException();
		return arr[top - 1];
	}
	public static void main(String[] args){
		Stack<Integer> s = new ArrayStack<Integer>();
		s.push(36);
		System.out.println(s.pop());
		s.push(666);
		System.out.println(s.pop());
	}

}
