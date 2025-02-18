package ex10_calendar;

import java.util.Calendar;
import java.util.Date;

/*
Date 클래스와 연결 
*/
public class CalendarEx3 {
	public static void main(String[] args) {
		// Date 객체 → Calendar 객체
		Date now = new Date();
		now.setTime(now.getTime() + (1000*60*60*24)); // 1일 후 
		System.out.println(now); // 내일날짜
		
		Calendar cal = Calendar.getInstance(); // 현재 날짜
		cal.setTime(now); // Date 클래스를 이용해서 → Calendar 객체의 날짜 설정
		System.out.printf("날짜:%4d-%02d-%02d\n", 
				cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH) + 1), cal.get(Calendar.DATE)  );
		
		// Calendar 객체 → Date 객체
		Date day = new Date();
		// cal.getTimeInMillis() : 밀리초값
		day.setTime(cal.getTimeInMillis());
		System.out.println(day);
		
		
	}
}
