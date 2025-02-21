package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		
		String orgfile = "src/test/apple.gif";
		String bakfile = "src/test/apple2.gif";		
		
		FileInputStream fis = new FileInputStream(orgfile);
		FileOutputStream fos = new FileOutputStream(bakfile);
	
		int data = 0;
		
		byte[] buf = new byte[1000];
		while ((data=fis.read(buf)) != -1)  {
			fos.write(buf, 0, data);
		}
		System.out.println("복사완료");
		fis.close();
		fos.flush();
		fos.close();	
	}
}
