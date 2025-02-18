package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		String scurce = "핸드폰:010-1111-1111, 집:02-123-5678,"
										+ "이메일:regular@aaa.bbb, 계좌번호:301-01-123456";
		
		// String telP = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String telP = "(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})";
		Pattern p = Pattern.compile(telP);
		Matcher m = p.matcher(scurce);
		int i = 0;
		System.out.println("전화번호: ");
		// m.find() : source에서 패턴에 맞는 문자열을 리턴
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		System.out.println("이메일: ");
		i = 0;
		// String emailP = "(\\w+)@(\\w+).(\\w+)";
		String emailP = "([0-9A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
		p = Pattern.compile(emailP);
		m = p.matcher(scurce);
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		System.out.println("계좌번호: ");
		i = 0;
		// String mP = "(\\d{3})-(\\d{2})-(\\d{6})";
		String mP = "([0-9]{3})-([0-9]{2})-([0-9]{6})";
		p = Pattern.compile(mP);
		m = p.matcher(scurce);
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}
}
