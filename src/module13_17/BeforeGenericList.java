package module13_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeforeGenericList {

	public static void main(String[] args) {
		List data = new ArrayList();
		data.add("Hello");
		data.add("World");
		data.add(10);

		Iterator it = data.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof String) {
				String str = (String) obj; // 強制轉型
				System.out.println(str);
//			System.out.println(str.substring(1));
			}else if(obj instanceof Integer) {
				Integer i1 = (Integer)obj;
				System.out.println(i1.intValue());
			}
		}
	}

}
