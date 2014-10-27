package practical3;
// Sai-keerthi-chandu Seshadri
// 13205471
public class ArrayStack implements Stack{
	int top;	
	Object[] arr = new Object[20];
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public Object pop() {
		if(top == 0) throw new StackEmptyException();
		
		return arr[--top];
	}
	public void push(Object object) {
		if(top == arr.length) throw new StackFullException();
		arr[top++] = object;
	}
	public Object top() {
		if(top==0) throw new StackEmptyException();
		return arr[top-1];
	}

}
