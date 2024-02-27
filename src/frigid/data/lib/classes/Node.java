package frigid.data.lib.classes;

public class Node {
	
	private Node next;
	private int value;
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node(int element) {
		this.value = element;
	}
}