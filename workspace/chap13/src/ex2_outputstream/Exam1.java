package ex2_outputstream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
OutputStreamEx1의 데이터를 한글도 깨지지 않도록 프로그램 수정하기
OutputStreamWriter 클래스 이용하기 
*/
public class Exam1 {
	public static void main(String[] args) throws IOException {
		// OutputStream out = System.out;
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush();
	}
}	
