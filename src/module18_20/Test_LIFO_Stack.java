package module18_20;

import java.util.*;

public class Test_LIFO_Stack {
	public static void main(String[] args) {
		Stack list = new Stack();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println(list.toString());

		// 用索引值拿資料,不會後進先出
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println();
		
		
		// 後進先出使用pop(); 注意宣告的類別為stack才有此方法
		while (!list.empty()) // 注意拿出來即移除
			System.out.println(list.pop());
		
		System.out.println(list);

	}
}