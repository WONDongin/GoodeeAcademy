package ex3_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/*
src/ex1_inputstrem/InputStreamEx1.java 파일 읽어서 
InputStreamEx1.bak 파일로 생성하기
FileInputStream 클래스로 구현하기
 
*/
public class Exam3 {
	public static void main(String[] args) throws IOException {
		String orgfile = "src/ex1_inputstrem/InputStreamEx1.java";
		String bakfile = "test";		
		FileInputStream fis = new FileInputStream(orgfile);
		FileOutputStream fos = new FileOutputStream(bakfile+".bak");
		
		int data = 0;
		
		/*
		while ((data = fis.read()) != -1) {
			fos.write(data);
		} */
		byte[] buf = new byte[1000];
		while ((data=fis.read(buf)) != -1)  {
			fos.write(buf, 0, data);
		}
		
		fis.close();
		fos.flush();
		fos.close();
		System.out.println("프로그램 종료");
	}
}
