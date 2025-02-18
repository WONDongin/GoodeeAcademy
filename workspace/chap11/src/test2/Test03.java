package test2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */
public class Test03 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		
		String number = "012-3456-7890 099-2456-7980 088-2346-9870 013-3456-7890";		
		String pass = "([0-9A-Za-z]+)-([3-6]{4})-([0-9A-Za-z]{4})";
		
		Pattern p = Pattern.compile(pass);
		Matcher m = p.matcher(number);
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		Scanner sc = new Scanner(number);
		
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
