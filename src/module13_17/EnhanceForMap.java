package module13_17;

import java.util.HashMap;
import java.util.Map;

public class EnhanceForMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < 6; i++) {
			map.put(i, "David" + i);
		}
		for (String val : map.values()) {  //沒有實作Iterator  把一個map裡面的值都列出來為一個集合
			System.out.println(val);  //也可用map.keySet 但要注意型別要改
		}
	}

}
