package frigid.data.lib.interfaces;

public interface List {
	
	public void addEnd(int element);

	public void addBegin(int element);
	
	public void addMiddle(int element, int position);
	
	public void remove(int element);
	
	public int getNode(int position);
	
	public int countNodes();
	
	public void destroy();
	
	public void showList();
	
	public int firstNode();
	
	public int lastNode();
	
	public boolean isEmpty();

}
