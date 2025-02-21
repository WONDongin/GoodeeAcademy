package ex1_inputstrem;

import java.io.IOException;
import java.io.InputStream;

/*
[입출력 스트림 : 데이터 이동통로. 단방향]    [추상클래스]
입력 스트림 : 바이트 => 바이트형 입력스트림 : InputStream
									1byte 단위로 읽기.
									동영상, 이미지, 텍스트 등을 읽기
           문자   => 문자형  입력스트림 : Reader
                                    2byte(1char) 단위로 읽기.
									텍스트데이터 읽기
									
출력 스트림 : 바이트 => 바이트형 출력스트림 : OutputStream
									1byte 단위로 쓰기.
									동영상, 이미지, 텍스트 등을 쓰기
           문자   => 문자형  출력스트림 : Writer
           							2byte(1char) 단위로 쓰기.
									텍스트데이터 쓰기
									
InputStreamReader  :  바이트형 입력스트림 -> 문자형입력스트림 변경 (Reader 의 하위 클래스)
OutputStreamWriter :  바이트형 출력스트림 -> 문자형출력스트림 변경 (Writer 의 하위 클래스)
									
									
[자바에서 제공되는 표준 입출력 스트림]
표준 입력 스트림 : InputStrem System.in  => 키보드에서 입력
표준 출력 스트림 : PrintStrem System.out => 콘솔(화면)으로 출력
표준 오류 스트림 : PrintStrem System.err => 콘솔(화면)으로 출력. 빨간색 출력
*/
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // 키보드 입력
		int data = 0;
		// in.read() : 1byte씩 읽기
		while ((data = in.read()) != -1) { // Ctrl+z (EOF)
			System.out.print((char)data);
		}
	}
}

/*
데이터 이동통로 단방향
입출력스트림(IO스트림)            

입력  바이트 : 바이트형 입력 스트림 : inputStream      타입 :  System.in 
(목적지:나)					   FileinputStream
								
							  ↓ InputStremReader : inputStream 받아서 Reader 로	
							  
     문자 : 문자형 입력 스트림 : Reader
     					    FileReader
      
     
     
출력  바이트 : 바이트형 출력 스트림 : OutputStream   System.out
(출발지:나)					   FileinOutPutStream
							   
							  ↓ OutputStremReader : inputStream 받아서 Reader 로	
							  
     문자 : 문자형 출력 스트림 : writer
     					    FileWriter
*/ 
