package practical2;
/*	Sai-Keerthi-Chandu Seshadri
   	13205471
 */

public class DoubleStack {
	double[] arr = new double[20];
	int top;
	void Push(double num){
		if(top == arr.length) throw new StackFullException();
		else
			arr[top++] = num;
	}
	double Pop(){
		if(top == 0) throw new StackEmptyException();
		else{
			double d = arr[--top];
			arr[top] = 0;
			return d;
		}
	}
	boolean isEmpty(){
		return top==0;
	}
	int size(){
		return top;
	}
	double top() {
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
		DoubleStack d = new DoubleStack();
		d.Push(3.2);
		d.Pop();
		d.Push(4.2);
		d.Push(3.0);
		d.Push(2.6);
		d.Pop();
		d.Push(1.2);
		d.Pop();
		d.Pop();
		System.out.println(d);
	}
}