package ex12_scanner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
str 문자열 내의 모든 숫자값의 합과 평균출력
*/
public class Exam1 {
	public static void main(String[] args) {
		String str = "100 and 200 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\s*and\\s*");
		
		int sum = 0, cnt = 0;
		
		while(true) {
			try {
				String token = sc.next();
				// token 데이터가 숫자 여부 검증				
				Pattern p =Pattern.compile("\\d+");
				Matcher m = p.matcher(token);
				if(m.matches()) {
					int num = Integer.parseInt(token);
					sum += num;
					cnt++;
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("숫자들의 합: " +  sum + ", 평균: " + (double) sum / cnt);
		
	}
}
