package frigid.data.lib.classes;

import frigid.data.lib.exceptionhandler.ExceptionHandler;
import frigid.data.lib.interfaces.Sort;

public class SortImplementation implements Sort{

	/*
	 * This method is a simple sort algorithm, called bubbleSort, that works fine for sorting a small list of elements, with a 
	 * time complexity of O(n^2) in the worst case.
	 */
	@Override
	public LinkedList sort(LinkedList list) {
		Node current;
		int aux;
		
		while(true) {
			current = list.getFirst();
			boolean swapped = false;
			while(current != null) {
				Node next = current.getNext();
				while(next != null) {
					if(current.getValue() > next.getValue()) {
						swapped = true;
						aux = current.getValue();
						current.setValue(next.getValue());
						next.setValue(aux);
					}
					next = next.getNext();
				}
				current = current.getNext();
			}
			if(!swapped) {
				break;
			}
		}
		if(list.isEmpty()) {
			ExceptionHandler.emptyList();
		}
		return list;
	}
}
