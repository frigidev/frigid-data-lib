package frigid.data.lib.classes;

import javax.swing.JOptionPane;
import frigid.data.lib.interfaces.Search;

public class LinearSearch implements Search{
	
	/*
	 * This is a method to make a linear search of an element in a LinkedList. It works fine for a small LinkedList.
	 */
	@Override
	public void linearSearch(LinkedList list) {
		Node pointer = list.getFirst();
		int searched;
		
		searched = Integer.parseInt(JOptionPane.showInputDialog("Enter a number that you want to search."));
		
		boolean found = false;
		int size = list.countNodes();
		
		if(size == 0) {
			return;
		}
		
		for(int i=0; i<size; i++) {
			if(list.getFirst().getValue() == searched || pointer.getValue() == searched) {
				found = true;
				break;
			}else if(pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
		}

		if(found) {
			JOptionPane.showMessageDialog(null, "Element found. The element exists in the list.");
		}else {
			JOptionPane.showMessageDialog(null, "Element not found. The element doesn't exists in the list.");
		}
	}
}
