package ex3_file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
화면에서 exit 값을 입력할때까지 내용을 받아 out3.txt 파일에 저장하기
[결과]
data.txt 파일에 저장할 내용을 입력하세요(종료:exit) 
aaaa
bbbb
exit
*/
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		/*
		// FileOutputStream
		FileOutputStream fw = new FileOutputStream("out3.txt");
		System.out.println("out3.txt 파일에 저장할 내용을 입력하세요(종료:exit) ");
		
		while (true) {
			String text = sc.nextLine();
			
			if(text.equals("exit")) {
				break;
			}
			// 입력 후 줄바꿈처리 
			fw.write((text + "\n").getBytes());
		}
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		fw.close();
		*/
		
		
		// FileWriter
		FileWriter fw = new FileWriter("out4.txt");
		System.out.println("out4.txt 파일에 저장할 내용을 입력하세요(종료:exit) ");
		while (true) {
			String text = sc.nextLine();
			
			if(text.equals("exit")) {
				break;
			}
			// 입력 후 줄바꿈처리 
			fw.write(text + "\n");
		}
		fw.close();
		sc.close();
	}
}
