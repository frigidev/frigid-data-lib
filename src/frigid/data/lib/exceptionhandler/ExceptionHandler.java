package frigid.data.lib.exceptionhandler;

public class ExceptionHandler extends Exception{
	
	private int error;
	
	public void setError(int error) {
		this.error = error;
	}
	
	public int getError() {
		return this.error;
	}
	
    public ExceptionHandler(String str){
    	super(str);
    }
    
    public int errorCodeEmptyList() {
    	this.setError(0);
    	return this.getError();
    }
    
    public int errorCodeSizeException() {
    	this.setError(-1);
    	return this.getError();
    }
}
