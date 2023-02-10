package module18_20;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
		this(empno, "-");
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
		this(0, "-"); // 或 empno = 0; ename = "-"
	}

	public void display() {
		System.out.println("empno=" + empno);
		System.out.println("ename=" + ename);
	}

	public int compareTo(Employee aEmployee) {
		// 物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
		if (this.empno > aEmployee.empno) {
			return 1;
		} else if (this.empno == aEmployee.empno) {
			return 0;
		} else {
			return -1; // 用正負值來代表左右關係
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno, ename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empno == other.empno && Objects.equals(ename, other.ename);
	}

//	// override equals
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//
//		// 要確認物件不是空的,null沒有記憶體位置
//		// 確認比較的物件來自同一類別
//		if (obj != null && this.getClass() == obj.getClass()) {
//			Employee e = (Employee) obj;
//
//			if (this.empno == e.empno && this.ename.equals(e.ename)) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	// override hashcode
//	public int hashCode() {
//		// 宣告固定質數 31為官方使用
//		final int prime = 31;
//		int sum = 1;
//		sum = sum * prime + empno;
//		sum = sum * prime + ((ename == null) ? 0 : ename.hashCode());
//		return sum;
//	}

}
