package frigid.data.lib.classes;

import javax.swing.JOptionPane;

import frigid.data.lib.exceptionhandler.ExceptionHandler;
import frigid.data.lib.interfaces.AdditionalMethods;
import frigid.data.lib.interfaces.List;

public class LinkedList implements List, AdditionalMethods{
	
	private Node first;
	private Node last;
	
	public void setFirst(Node first) {
		this.first = first;
	}
	
	public Node getFirst() {
		return this.first;
	}
	
	public void setLast(Node last) {
		this.last = last;
	}
	
	public Node getLast() {
		return this.last;
	}
	
	public LinkedList() {
		this.first = null;
		this.last = null;
	}

	@Override
	public void addBegin(int element) {
		Node node = new Node(element);
		
		if(isEmpty()) {
			this.setLast(node);
		}else {
			node.setNext(this.getFirst());
		}
		this.setFirst(node);
	}
	
	@Override
	public void addEnd(int element) {
		Node node = new Node(element);
		
		if(isEmpty()) {
			this.setFirst(node);
		}else {
			this.getLast().setNext(node);
		}
		this.setLast(node);
	}

	@Override
	public void addMiddle(int element, int position) {
		Node node = new Node(element);
		Node current = this.getFirst();
		Node aux;
		int size = countNodes();
		int i = 1;
		
		if(position == 1) {
			addBegin(element);
		}else if(position == size+1) {
			addEnd(element);
		}else if(position > size+1) {
			System.out.println("The position desired exceed the size of the list.");
		}else if(position < 1) {
			System.out.println("The list begins in the position 1. Try a valid position.");
		}else {
			while(i < (position-1)) {
				current = current.getNext();
				i++;
			}	
			aux = current.getNext();
			current.setNext(node);
			node.setNext(aux);
		}
	}
	
	@Override
	public void remove(int element) {
		Node current = this.getFirst();
		Node previous = null;
		
		if(!isEmpty()) {
			if(current.getValue() == element) {
				this.setFirst(this.getFirst().getNext());
				current = null;
			}
			
			while(current != null && current.getValue() != element) {
				previous = current;
				current = current.getNext();
				if(current == null) {
					JOptionPane.showMessageDialog(null, "The number that you tried to remove was not found.");
				}
				/*
				 * Previous points to the last node of the list, if all the list was traversed, then the conditional below has to fill this case
				 * (when the element == the value of the last node of the list).
				 */
				if(previous.getValue() == element) {
					previous.setNext(null);
				}
			}
			
			if(current != null) {
				previous.setNext(current.getNext());
			}
			
			this.setLast(previous);
			
		}else {
			ExceptionHandler.emptyList();
		}
	}
	
	@Override
	public int getNode(int position) {
		Node current = this.getFirst();
		int size = countNodes();
		
		if(position <= size && current != null && position > 0) {
			for(int i=1; i<position; i++) { 
				current = current.getNext();
			}
			return current.getValue();
		}else {
			return ExceptionHandler.sizeExceptionMessage();
		}
	}

	@Override
	public int countNodes() {
		Node current = this.getFirst();
		int counter = 0;
		/*
		 * This control variable below is declared to avoid an emptyList() message at the invocation of this method when a first node is added to the
		 * list.
		 */
		int control;
		
		if(this.getFirst() != null) {
			control = 1;
			if(!isEmpty() && control == 1) {
				while(current != null) {
					current = current.getNext();
					counter++;
				}
			}else {
				return ExceptionHandler.emptyList();
			}
		}		
		return counter;
	}

	@Override
	public void destroy() {
		this.setFirst(null);
		this.setLast(null);
	}

	@Override
	public void showList() {
		Node current = this.getFirst();
		int i = 1;
		
		while(current != null) {
			System.out.println("Node: " + current.getValue() + " of the position: " + i + " of the list.");
			current = current.getNext();
			i++;
		}
		if(isEmpty()) {
			ExceptionHandler.emptyList();
		}
	}

	@Override
	public void firstNode() {
		if(!isEmpty()) {
			JOptionPane.showMessageDialog(null, "The first node of the list is: " + this.getFirst().getValue());
		}else {
			ExceptionHandler.emptyList();
		}
	}

	@Override
	public void lastNode() {
		if(!isEmpty()) {
			JOptionPane.showMessageDialog(null, "The last node of the list is: " + this.getLast().getValue());
		}else {
			ExceptionHandler.emptyList();
		}
	}

	@Override
	public boolean isEmpty() {
		if(this.getFirst() == null && this.getLast() == null) {
			return true;
		}
		else {
			return false;
		}
	}

	//Below there are the implementation of all the methods of the interface AdditionalMethods
	@Override
	public void showPairs() {
		Node current = this.getFirst();
		int size = countNodes();
		
		if(!isEmpty()) {
			for(int i=0; i<size; i++) {
				if(current.getValue() % 2 == 0) {
					System.out.println(current.getValue());
				}
				current = current.getNext();
			}
		}else {
			ExceptionHandler.emptyList();
		}
	}

	@Override
	public void showOddN() {
		Node current = this.getFirst();
		int size = countNodes();
		
		if(!isEmpty()) {
			for(int i=0; i<size; i++) {
				if(current.getValue() % 2 == 1) {
					System.out.println(current.getValue());
				}
				current = current.getNext();
			}
		}else {
			ExceptionHandler.emptyList();
		}
	}

	@Override
	public int sumNodes() {
		Node current = this.getFirst();
		int sum = -2;
		
		if(!isEmpty()) {
			while(current != null) {
				sum = sum + current.getValue();
				current = current.getNext();
			}
			return sum+2;
		}else {
			return sum;
		}
	}
}
