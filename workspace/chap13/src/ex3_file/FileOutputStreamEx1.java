package ex3_file;

import java.io.FileOutputStream;
import java.io.IOException;

/*
[FileOutputStream]
예제 : 파일에 데이터를 저장.

주요메서드
void write(int data): 1byte를 출력.
void write(byte[] buf): buf의 내용을 출력
void write(byte[] buf, int start, int len): buf의 start 인덱시 부터 len 크기 만큼 내용 출력

생성자 : FileNotFoundException 예외처리 필수(파일을 생성 할수있는 권한이 없을때), IOException의 하위 클래스
write() : IOException 예외처리 필수
 
*/
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		// FileOutputStream fos = new FileOutputStream("out.txt");
		FileOutputStream fos = new FileOutputStream("out.txt", true);
		/*
		 fos : out.txt 파일에 내용을 쓸수있는 출력 바이트형 출력 스트림
		 out.txt 파일이 없으면 out.txt파일을 생성하여 내용출력
		 out.txt 파일이 있으면 out.txt파일에 내용출력, 기존의 내용을 사라짐. 최종결과만 출력
		 
		 new FileOutputStream("out.txt") : out.txt 파일에 내용 출력, 최종내용만 남음
		 new FileOutputStream("out.txt", true) : out.txt 파일에 내용 출력, 기존내용 + 새로운 내용을 추가함
		*/
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		// String.getBytes() : 문자열 byte[]로 리턴
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf); // buf의 내용을 out.txt파일에 출력
		fos.write(buf, 5, 6); // buf의 5번 ~ 6개의 바이트를 출력
		fos.flush();
	}
}
