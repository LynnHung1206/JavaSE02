package module13_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
//		List<String> data = new ArrayList<>(); 後面的可以省略
		data.add("Hello");
		data.add("World");

		Iterator<String> it = data.iterator();  //迭代器也有支援泛型
		while (it.hasNext()) {
			String str = it.next(); // 強制轉型,不再需要
			System.out.println(str);
		}
	}

}
