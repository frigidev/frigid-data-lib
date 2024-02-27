package frigid.data.lib.exceptionhandler;

import javax.swing.JOptionPane;

public class ExceptionHandler {
	
    public static int sizeExceptionMessage() {
        JOptionPane.showMessageDialog(null, "Error. The element searched is null. Error code: -1");
        return -1;
    }
    
    public static int emptyList() {
    	JOptionPane.showMessageDialog(null, "Error. The list is empty. Error code: -2");
    	return -2;
    }
}