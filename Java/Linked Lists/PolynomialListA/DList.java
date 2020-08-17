public class DList<T> {
	public DNode head, tail;
	private int length;
	
	public DList() {
		head = new DNode(null, tail, null);
		tail = new DNode(head, null, null);
		length = 0;
	}
	
	public void append(T data) {
		DNode<T> newNode = new DNode<>(tail.prev, tail, data);
		tail.prev.next = newNode;
		tail.prev = newNode;
		length++;
	}
	
	public String toString() {
		String rs = "";
		
		DNode<T> p = head;
		int power = length;
		while(p.next.data != null) {
			power--;
			p.prev = p;
			p = p.next;
			rs += p.data;
			if(power > 1) rs += "x^" + power;
			else if (power == 1) rs += "x";
			if(p.next.data != null) rs += " + ";
		}
		
		return rs;
	}
}
