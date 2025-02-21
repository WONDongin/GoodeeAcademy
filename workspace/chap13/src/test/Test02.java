package test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
2. 
 bin/ex1_inputstream/InputStreamEx1.class 파일은 이진 파일이다. 
 이파일을 읽어서 16진수로 출력하기
 
 [결과]
CA FE BA BE 00 00 00 34 00 8E 07 00 02 01 00 17 
63 68 61 70 31 35 2F 50 72 69 6E 74 53 74 72 65 
61 6D 54 65 73 74 32 07 00 04 01 00 10 6A 61 76 
61 2F 6C 61 6E 67 2F 4F 62 6A 65 63 74 01 00 06 
3C 69 6E 69 74 3E 01 00 03 28 29 56 01 00 04 43 
6F 64 65 0A 00 03 00 09 0C 00 05 00 06 01 00 0F 
.... */

public class Test02 {
	public static void main(String[] args) throws IOException{
		char[] buf = new char[10000];
		int data = 0;
		FileReader fr = new FileReader("bin/ex1_inputstrem/ReaderEX1.class");
	
			
		while ((data = fr.read()) != -1) {
			System.out.println(String.format("%X,%x", 255,255) + (char)data);
		}
	}
}
