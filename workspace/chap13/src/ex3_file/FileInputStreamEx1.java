package ex3_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream : 파일의 내용을 읽어서 화면 출력하기

주요메서드
int read() : 1바이트 읽어서 내용을 리턴
int read(byte[] buf) : buf의 크기만큼 읽어서 내용은 buf에 저장. 읽은 바이트 수를 리턴
int read(byte[] buf, int, start, int, len) :
len 크기만큼 읽어서 buf의 start 인덱스 부터 내용을 저장. 읽은 바이트수를 리턴	

int available() : 읽기 가능 바이트 수 리턴
*/
public class FileInputStreamEx1  {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex2_outputstream/Exam1.java");
		int data = 0;
		System.out.println("======================== read() 메서드를 이용하여 읽기 ========================");
		while ((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		System.out.println("======================== read(byte[]) 메서드를 이용하여 읽기 ========================" );
		
		// FileInputStream : ...위치의 파일 읽기
		fis = new FileInputStream("src/ex2_outputstream/Exam1.java");
		
		// fis.available() : 읽기 가능 바이트 수
		// 100바이트짜리 파일 중     읽은 않은 경우 fis.available() : 100
		// 100바이트짜리 파일 중 1바이트를 읽은 경우 fis.available() : 99
		byte[] buf = new byte[fis.available()];
		System.out.println("fis.available() = " + fis.available());
		
		// fis.read(buf) : fis(파일)에서 buf만큼 읽어서, 읽은 내용은 buf에 저장! 실제 읽은 크기를 리턴.
		// data : 실제로 읽은 바이트 수
		while ((data = fis.read(buf)) != -1) {
			// new String(buf, 0, data) : buf의 0번 인덱스 부터 data의 크기만큼 -> 문자열 객체로 생성
			System.out.print(new String(buf, 0, data));
			System.out.println("data=" + data);
		}
		
		System.out.println("======================== read(byte[],int,int) 메서드를 이용하여 읽기 ========================");
		fis = new FileInputStream("src/ex2_outputstream/Exam1.java");
		// +1 인덱스 0번 채우기
		buf = new byte[fis.available() + 1];
		buf[0] = 'A';
		// fis.read(buf, 1, buf.length - 1) : buf 인덱스 1번부터 ~ 데이터 읽어서 저장
		while ((data = fis.read(buf, 1, buf.length - 1)) != -1) {
			// 바이트 배열 -> 문자열 변환출력
 			System.out.print(new String(buf, 0, data));
			System.out.println("data=" + data);
		}
		fis.close();
	
	}
}
