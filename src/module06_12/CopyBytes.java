package module06_12;

import java.io.*;

public class CopyBytes {
	public static void main(String[] args) throws IOException {
		
		
		File inputFile = new File("farrago.txt");//建立檔案物件
		File outputFile = new File("outagain.txt"); //沒有規定要事先存在

		FileInputStream in = new FileInputStream(inputFile);  //利用建構子參數接檔案水管
		FileOutputStream out = new FileOutputStream(outputFile);//資料輸出的目的地
		int c;  //儲存讀取的資料

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}

		// 使用FileInputStream,FileOutputStream 時, 解決中文碼印出問題
//		int i = 0;
//		byte ch[] = new byte[(int) inputFile.length()];
//		while ((c = in.read()) != -1) {
//			out.write(c);
//			ch[i++] = (byte) c;
//		}
//		System.out.print(new String(ch));
//		System.out.flush();

		in.close();
		out.close();
	}
}
