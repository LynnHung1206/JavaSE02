package module01_05;

public class TestThrowDemo {
	public static double method(double i, double j) throws ArithmeticException {
		double result;
		if (j == 0) {
			throw new ArithmeticException("喂! 除到0 ! 算數錯誤!");
			  //產生一個例外物件呼叫建構子,利用建構子設定訊息內容
		}
		result = i / j;
		return result;
	}

	public static void main(String[] args) {
		try {
			System.out.println(method(1, 0));
		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
			// 或
//			e.printStackTrace();  //呼叫顯示錯誤
			System.out.println(e.toString());  //toString可省略
		}
	}

}
