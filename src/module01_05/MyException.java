package module01_05;

public class MyException extends Exception {
	
	public MyException() {  //無參數建構子
	}
	
	public MyException(String message) {
		super(message);
	}
}
