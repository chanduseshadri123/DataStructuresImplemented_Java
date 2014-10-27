package practical2;
/*	Sai-Keerthi-Chandu Seshadri
	13205471
*/
public class CharStack {

	char[] arr = new char[20];
	int top;
	void Push(char n){
		if(top == arr.length) throw new StackFullException();
		else
			arr[top++] = n;
	}
	char Pop(){
		if(top == 0) throw new StackEmptyException();
		else{
			char d = arr[--top];
			arr[top] = '\u0000';
			return d;
		}
	}
	boolean isEmpty(){
		return top==0;
	}
	int size(){
		return top;
	}
	char top() {
		if (top == 0) throw new StackEmptyException(); 
		return arr[top-1];
	}
	
	public String toString() {
		String out = "[" + top + " / " + arr.length + "]";
		for (int i=0;i<top; i++) {
			out += " " + arr[i];
		}
		return out;
	}
	public static void main(String[] args){
		// This being a stack implementation, it follows "Last In First Out" methodology, 
		//if we pass the letters of a word through push, and pop it out, it will probably give the reverse implementation of the word.
		CharStack d = new CharStack();
		d.Push('Y');
		d.Push('p');
		d.Push('p');
		d.Push('a');
		d.Push('h');
		System.out.println(d.Pop());
		System.out.println(d.Pop());
		System.out.println(d.Pop());
		System.out.println(d.Pop());
		System.out.println(d.Pop());
		System.out.println(d);
	}

}
