package practical9;

import practical8.Position;


public class ListMap<K, V> implements Map<K, V> {
	public class ListMapEntry implements Entry<K, V> {
		K key;
		V value;

		ListMapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K key() {

			return key;
		}

		public V value() {

			return value;
		}
	}

	List<Entry<K, V>> list = new LinkedList<Entry<K, V>>();

	public Position<Entry<K, V>> find(K k) {
		Position<Entry<K, V>> p = list.first();
		while (p != null) {
			if (p.element().key() == k) {
				return p;
			} else
				p = list.next(p);
		}
		return null;
	}

	public int size() {

		return list.size();
	}

	public boolean isEmpty() {

		return list.isEmpty();
	}

	public V get(K k) {
		Position<Entry<K, V>> p = find(k);
		if (p == null) {
			return null;
		}
		return p.element().value();
	}

	public V put(K k, V v) {
		Position<Entry<K, V>> p = find(k);
		Entry<K, V> e = new ListMapEntry(k, v);
		if (p == null) {
			list.insertLast(e);
			return null;
		} else {
			Entry<K, V> temp = list.replace(p, e);
			return temp.value();
		}

	}

	public V remove(K k) {
		Position<Entry<K, V>> p = find(k);
		if (p == null) {
			return null;
		}
		V temp = p.element().value();
		list.remove(p);

		return temp;
	}

	public Iterator<K> keys() {

		return null;
	}

	public Iterator<V> values() {

		return null;
	}

	public Iterator<Entry<K, V>> entries() {

		return null;
	}
	public String toString() {
		if (list.size() == 0) return "";
		
		String output = "[" + size() + "]";
		Position<Entry<K, V>> p = list.first();
		while (p != null) {
			output += " " + p.element().key() + " " + p.element().value();
			p = list.next(p);
		}
		return output;
	}

	public static void main(String[] args){
		Map<String,String> map = new ListMap<String,String>();
		
		map.put("ie", "Ireland");
		map.put("uk", "United Kingdom"); 
		map.put("us", "USA"); 
		map.put("de", "Germany"); 
		map.put("fr", "France"); 
		map.remove("uk"); 
		map.put("us", "United States of America"); 
		map.put("es", "Spain"); 
		map.put("uk", "United Kingdom"); 
		System.out.println(map.get("us")); 
		
	}
}
