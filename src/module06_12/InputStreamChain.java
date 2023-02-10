package module06_12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamChain {
	public static void main(String args[]) {
		int i = 0;
		int j = 0;
		try {

//			FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
//			while ((i = fis.read()) != -1)
//				System.out.print((char) i);
//			fis.close();  //關閉資料流

			FileInputStream fis = new FileInputStream("c:\\javawork\\hello2.txt");
			BufferedInputStream bis = new BufferedInputStream(fis); // 緩衝區 用建構子把小水管接上
			while ((i = bis.read()) != -1) // 讀寫使用高階資料流
			{
				System.out.print((char) i);
				j++;
			}

			bis.close();
			fis.close();

		} catch (IOException e) {
		}
		System.out.println(j);
	}
	
}
