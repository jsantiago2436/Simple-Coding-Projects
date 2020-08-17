public class DNode<T> {
	protected T data;
	protected DNode prev, next;
	protected int length;
	
	public DNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public DNode() {
		this.data = null;
		this.next = null;
		this.prev = null;
	}
	public DNode(DNode prev, DNode next, T data) {
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
}
