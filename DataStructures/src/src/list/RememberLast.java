package src.list;

public class RememberLast<T> {

	private T lastElement;
	private int numElements;
	
	public RememberLast() {
		numElements = 0;
		lastElement = null;
	}
	
	public T add (T element) {
		T prevLast = lastElement;
		lastElement = element;
		numElements++;
		return prevLast;		
	}
	
	public static void main(String[] args) {
		RememberLast r = new RememberLast<String>();
		
		System.out.println( r.add("Bajal") );
		
		System.out.println( r.add("Jaslina") );
	}
}
