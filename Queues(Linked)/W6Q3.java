package practical5;

public class W6Q3 {

	public static void main(String[] args) {
		LinkedQueque<Integer> queu = new LinkedQueque<Integer>();
		queu.enqueue(10);
		System.out.println(queu);
		queu.enqueue(5);
		System.out.println(queu);
		queu.dequeue();
		System.out.println(queu);
		queu.enqueue(15);
		System.out.println(queu);
		queu.enqueue(3);
		System.out.println(queu);
		queu.dequeue();
		System.out.println(queu);
		queu.enqueue(7);
		System.out.println(queu);
		queu.dequeue();
		System.out.println(queu);
		queu.enqueue(20); 
		System.out.println(queu);
		int size = queu.size;
		int total = 0;
		while(size != 0){
			total += queu.dequeue();
			size--;
		}
		System.out.println(total);
	}
	
}
