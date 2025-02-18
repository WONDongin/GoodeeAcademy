package ex12_scanner;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "100 and 200 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		// and 기준으로 문자열을 분리 > 읽기
		// .useDelimiter 메소드  : 정규식
		sc.useDelimiter("\\s*and\\s*");
		
		while(true) {
			try {
				String token = sc.next();
				System.out.println(token);
			} catch (Exception e) {
				// NoSuchElementException : Scanner 객체가 읽을 수 있는 데이터가 없는 경우 예외 발생
				break;
			}
		}
	}
}
