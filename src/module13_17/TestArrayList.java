package module13_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List list = new ArrayList(); //多型,用父類別List宣告
		list.add(12); //自動裝箱,同下
//		list.add(new Integer(12));
		
		list.add(new Long(34L));
		list.add(new Double(5.6));
		list.add("Hello");
		list.add("Hello"); // 值重覆仍加入到集合裡

		System.out.println("toString()=" + list); //集合的toString都有override
		System.out.println("元素個數=" + list.size());

		Iterator objs = list.iterator();  //拿介面宣告變數
		while (objs.hasNext())
			System.out.println(objs.next());

		// List家族可以用Iterator或for迴圈取值
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
