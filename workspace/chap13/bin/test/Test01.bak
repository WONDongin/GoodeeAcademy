package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("파일명을 입력하세요: ");
			String name = sc.nextLine();			
			
			try {
				FileInputStream fis = new FileInputStream(("src/test/" + name + ".java"));
				
				int data = 0;
				byte[] buf = new byte[fis.available()];
				while ((data = fis.read(buf)) != -1) {
					System.out.print(new String(buf, 0, data));
				}
				fis.close();
			} catch (FileNotFoundException e) {
				System.out.println("해당 파일 없음");
				System.out.println("시스템 종료");
				break;
			}
		}
		sc.close();
	}
}
