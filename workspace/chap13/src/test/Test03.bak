package test;
/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("파일명을 입력하세요(종료:exit)");
			String site = sc.nextLine();
			
			try {
				if(site.equals("exit")) break;
				
				FileInputStream fis = new FileInputStream("src/test/" + site + ".java");
				FileOutputStream fos = new FileOutputStream("src/test/"+ site +".bak");
				
				int data = 0;
				
				byte[] buf = new byte[1000];
				while ((data=fis.read(buf)) != -1)  {
					fos.write(buf, 0, data);
				}
				System.out.println(site + ".txt =>" + site +".bac 복사완료");
				
				fis.close();
				fos.flush();
				fos.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("해당 파일 없음");
				continue;
			}
		}
	}
}
