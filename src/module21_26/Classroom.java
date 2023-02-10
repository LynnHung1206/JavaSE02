package module21_26;

public class Classroom extends Thread {
	private int no;
	private String tName;
	
	public Classroom(int no, String tName) {
		this.no = no;
		this.tName = tName;
	}
	
	public void run() {
		System.out.println(no + " 教室 " + tName + " 上課了!");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(no + " 教室 " + tName + " 下課了!");
	}
	
}
