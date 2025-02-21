package ex3_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader 클래스 : 파일에서 데이터 2byte 단위로 읽기
- 주요 메서드
int read() : 파일에서 데이터를 1char 단위로 읽기
int read(char[] buf) : 파일에서 buf 크기 만큼 읽어서 buf에 내용저장. 실제읽은 char 수를 리턴
int read(char[] buf, int start, int len) :
파일에서 len 크기만큼 읽어서, buf의 start 인덱스 부터 저장, 실제 읽은 char수를 리턴

read() : IOException 예외처리 필수
생성자 : FileNotFoundException 예외처리 필수 (IOException 의 하위 클래스)

*/
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		char[] buf = new char[8000];
		int data = 0;
		FileReader fr = new FileReader("src/ex2_outputstream/Exam1.java");
		System.out.println("============================== read() 메서드로 읽기 ==============================");
		while ((data = fr.read()) != -1) {
			System.out.print((char) data);
		}
		
		System.out.println();
		System.out.println("============================== read(char[]) 메서드로 읽기 ==============================");
		fr = new FileReader("src/ex2_outputstream/Exam1.java");
		while ((data = fr.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		
		System.out.println();
		System.out.println("============================== read(char[], int, int) 메서드로 읽기 ==============================");
		fr = new FileReader("src/ex2_outputstream/Exam1.java");
		while ((data = fr.read(buf, 0, buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println();
	}
}
