package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Date 클래스
SimpleDateFormat : 형식화 클래스. java.text 패키지의 클래스
	String  format(Date) : Date 객체를 지정한 형식대로 문자열로 변경하여 리턴
	Date parse(String) : 형식화된 문자열로 이루어진 날짜형태의 문자열을 Date 객체로 변경
	- ParseException 예외처리 필수!
	
날짜 format에 사용되는 문자
yyyy : 년도 4자리
MM : 월 2자리
dd : 일 2자리
HH : 시간 2자리
mm : 분 2자리
ss : 초 2자리
E : 요일
a : 오전/오후

*/
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜
		System.out.println(now);
		
		// SimpleDateFormat
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E a");
		System.out.println(sf.format(now));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDateString = "2025-12-25 10:00:00";
		Date day = null;
		
		try {
			// parse
			day = sf2.parse(formatDateString);
		} catch (ParseException e) {
			e.printStackTrace(); // 예외처리 필수
		}
		
		System.out.println(day);
		
		// day 날짜를 2025-12-25 목요일
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
	}
}
