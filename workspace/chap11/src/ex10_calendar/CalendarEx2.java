package ex10_calendar;

import java.lang.ref.Cleaner;
import java.util.Calendar;

/*
Calendar 클래스에 날짜 설정하기 
*/
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// 날짜 설정
		cal.set(2025, (2-1), 28); // 월 - 1
		System.out.println("날짜: " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) +  "-" + cal.get(Calendar.DATE));
		System.out.printf("날짜:%4d-%02d-%02d\n", 
				cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE)  );
		
		// 2025-12-25일의 날짜와 요일을 출력하기
		String week = "일월화수목금토";
		cal.set(2025, (12-1), 25); //날짜 설정
		System.out.printf("날짜:%4d-%02d-%02d %c요일\n", 
				cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE), week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
	}
}
