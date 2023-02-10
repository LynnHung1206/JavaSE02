package module21_26;

public class Tibame {
	
	public static void main(String[] args) {
		System.out.println("Tibame開門了");
		
		Classroom c1 = new Classroom(901, "郭老");
		Classroom c2 = new Classroom(902, "大吳");
		Classroom c3 = new Classroom(905, "小吳");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Tibame關門了");
	}
}
