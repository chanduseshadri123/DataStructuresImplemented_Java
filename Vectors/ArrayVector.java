package practical7;

public class ArrayVector<T> implements Vector<T> {
	
	private T[] array = null;
	private int rank = 0;
	int size =0;
	private int N = 50;
	
	public ArrayVector(int capacity) {
		N=capacity;
		array = (T[]) new Object[N];
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public T elemAtRank(int rank){
		if(rank<0 || rank >size-1){
			throw new RankOutOfBoundsException();
		}
		return array[rank];
	}
	
	public T replaceAtRank(int rank, T element){
		if(rank <0 || rank > size-1){
			throw new RankOutOfBoundsException();
		}
		T e = array[rank];
		array[rank] = element;
		return e;
	}

	public void insertAtRank(int rank, T element){
		if (rank < 0 || rank > size){
			throw new RankOutOfBoundsException();
		}
		if(size==N){
			N=N*2;
			T[] arrayb= (T[]) new Object[N];
			for	(int i=0;i<size;i++){
				arrayb[i] = array[i];
				
			}
			
			array=arrayb;
		}
		
		for(int i=size-1; i>=rank; i--){
			array[i+1]=array[i];
		}
			array[rank] = element;
			size = size+1;
	}

	public T removeAtRank(int rank){
		if(rank <0 || rank>size-1){
			throw new RankOutOfBoundsException();
		}
		T element = array[rank];
		for(int i=rank; i<size; i++){
			array[i] = array[i+1];
		}
		array[size-1]=null;
		size--;
		return element;
	}
	
	public String toString() {

		String out = "[" + size + "]:";
		for (int i=0;i<N; i++) {
		//	if (array[i] != null){
				out += " " + array[i];
			//}	
		}
		return out;
	}

	public static void main(String[] args) {
		
		ArrayVector<Character> vec= new ArrayVector<Character>(10);
		vec.insertAtRank(0, 'A');
		System.out.println(vec);
		vec.insertAtRank(1, 'P');
		System.out.println(vec);
		vec.insertAtRank(2, 'E');
		vec.insertAtRank(3, 'S');
		System.out.println(vec);
		vec.insertAtRank(3, 'i');
		System.out.println(vec);
		System.out.println(vec.removeAtRank(1));
		System.out.println(vec);
	}
}
