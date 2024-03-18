package frigid.data.lib;

import javax.swing.JOptionPane;

import frigid.data.lib.classes.LinearSearch;
import frigid.data.lib.classes.LinkedList;
import frigid.data.lib.classes.SortImplementation;
import frigid.data.lib.exceptionhandler.ExceptionHandler;

public class Main {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		while(true) {
			int op = Integer.parseInt(JOptionPane.showInputDialog("Choose one operation of the list:\n1 - add number\n2 - remove number\n3 - show list\n"
					+ "4 - show first and last\n5 - size of the list\n6 - get a number of the list by position\n7 - more options\n8 - exit"));	
		
			switch(op) {
				case 1:
					int value = Integer.parseInt(JOptionPane.showInputDialog("Type a number."));
					int position = Integer.parseInt(JOptionPane.showInputDialog("Do you want to insert your number in which position of the list?\n"
							+ "1 - begin of the list\n2 - middle of the list\n3 - end of the list"));
					if(position == 1) {
						list.addBegin(value);
					}else if(position == 2) {
						int midPosition = Integer.parseInt(JOptionPane.showInputDialog("Do you want to insert your number in which position of the middle of the list?"));
						list.addMiddle(value, midPosition);
					}else if(position == 3) {
						list.addEnd(value);
					}
					continue;
				case 2:
					int remove = Integer.parseInt(JOptionPane.showInputDialog("Type a number to remove."));
					list.remove(remove);
					continue;
				case 3:
					list.showList();
					System.out.println();
					continue;
				case 4:
					list.firstNode();
					list.lastNode();
					continue;
				case 5:
					JOptionPane.showMessageDialog(null, "The size of the list is: " + list.countNodes());
					continue;
				case 6:
					int positionNode = Integer.parseInt(JOptionPane.showInputDialog("Type a position that you want to know the number."));
					if(!list.isEmpty()) {
						JOptionPane.showMessageDialog(null, "The number of this position is:");
					}
					JOptionPane.showMessageDialog(null, list.getNode(positionNode));
					continue;
				case 7:
					int moreOptions = Integer.parseInt(JOptionPane.showInputDialog("1 - to sort the numbers\n2 - to search a number\n3 - to show the pairs or odd numbers\n4 - to " +
							"show the sum of all numbers\n5 - back to main menu"));
					switch(moreOptions) {
						case 1: 
							SortImplementation sortList = new SortImplementation();
							sortList.sort(list);
							if(!list.isEmpty()) {
								JOptionPane.showMessageDialog(null, "The numbers now are sorted. The current list is:");
								list.showList();
							}
							continue;
						case 2:
							LinearSearch search = new LinearSearch();
							search.linearSearch(list);
							continue;
						case 3:
							int choose = Integer.parseInt(JOptionPane.showInputDialog("1 - for all pair numbers\n2 - for all odd numbers"));
							if(choose == 1) {
								list.showPairs();
							}else if (choose == 2) {
								list.showOddN();
							}
							continue;
						case 4:
							if(!list.isEmpty()) {
								JOptionPane.showMessageDialog(null, "The sum of all numbers is:");
								JOptionPane.showMessageDialog(null, list.sumNodes());
							}else {
								ExceptionHandler.emptyList();
							}
							continue;
						case 5:
							continue;
					}
				case 8:
					JOptionPane.showMessageDialog(null, "End of execution");
					return;
			}
		}		
	}
}
