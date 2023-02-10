package module01_05;

public class TestThrows1 {
	String[] strs = { "Hello1", "Hello2", "Hello3" };

	public void printStrs(int i) throws Exception {
		System.out.println(strs[i]);
	}

	public static void main(String[] args) {
		int i = 0;
		TestThrows1 t1 = new TestThrows1();
		while (i < 4) {
			try {
				t1.printStrs(i);  //呼叫的方法有丟出例外(要處理)的宣告,就要作應對才不會報錯
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1-已超出陣列的長度");
			} catch (Exception e) {
				System.out.println("2-發生Exception");
			}
			i++;
		}
	}

}
