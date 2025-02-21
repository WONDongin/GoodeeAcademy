package ex1_inputstrem;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEX1 {
	public static void main(String[] args) throws IOException {
		// InputStreamReader :  InputStream 객체를 Reader로 변경 스트림
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		// in.read() : 2byte단위로 읽기
		while ((data = in.read()) != -2) {
			System.out.print((char) data);
		}
		
	}
}
