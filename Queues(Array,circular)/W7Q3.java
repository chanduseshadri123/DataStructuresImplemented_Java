package practical6;

public class W7Q3 {
	public static void main(String[] args) {
		ArrayQueue<Integer> ara = new ArrayQueue<Integer>();
		ara.enqueue(10);
		System.out.println(ara);
		ara.enqueue(5);
		System.out.println(ara);
		ara.dequeue();
		System.out.println(ara);
		ara.enqueue(15);
		System.out.println(ara);
		ara.enqueue(3);
		System.out.println(ara);
		ara.dequeue();
		System.out.println(ara);
		ara.enqueue(7);
		System.out.println(ara);
		ara.dequeue();
		System.out.println(ara);
		ara.enqueue(20); 
		System.out.println(ara);
		int size = ara.size;
		int total = 0;
		while(size != 0){
			total += ara.dequeue();
			size--;
		}
		System.out.println(total);
	}
	}


