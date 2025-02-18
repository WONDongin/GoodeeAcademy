package ex10_calendar;

import java.util.Calendar;

/*
Calendar 클래스
- 추상클래스 : 객체화 불가, getInstance() 메서드로 객체 리턴
*/
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		// .get(Calender.YEAR)
		System.out.println("년도: " + today.get(Calendar.YEAR));
		// .get((Calender.MONTH) + 1)
		System.out.println("월(0~11): " + (today.get(Calendar.MONTH) + 1));
		// .get(Calender.WEEK_OF_YEAR)
		System.out.println("년도기준 몇쨰주: " + today.get(Calendar.WEEK_OF_YEAR));
		// .get(Calender.WEEK_OF_MONTH)
		System.out.println("월 기준 몇쨰주: " + today.get(Calendar.WEEK_OF_MONTH));
		
		// .get(Calender.DATE)
		System.out.println("일자: " + today.get(Calendar.DATE));
		// .get(Calender.DAY_OF_MONTH)
		System.out.println("월 기준 일자: " + today.get(Calendar.DAY_OF_MONTH));
		// .get(Calender.DAY_OF_YEAR)
		System.out.println("년 기준 일자: " + today.get(Calendar.DAY_OF_YEAR));
		
		// .get(Calender.DAY_OF_WEEK)
		System.out.println("요일(1:일 ~ 7:토): " + today.get(Calendar.DAY_OF_WEEK));
		// .get(Calender.DAY_OF_WEEK_IN_MONTH)
		System.out.println("월 기준 몇쨰: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		// .get(Calender.AM_PM)
		System.out.println("오전(0) / 오후(1)): " + today.get(Calendar.AM_PM));
		// .get(Calender.HOUR)
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		// .get(Calender.HOUR_OF_DAY)
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		// .get(Calender.MINUTE)
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		// .get(Calender.SECOND)
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		// .get(Calender.MILLISECOND)
		System.out.println("밀리초(0~999): " + today.get(Calendar.MILLISECOND));
		
		// .get(Calender.ZONE_OFFSET) - 영국시간과 시차(9시간)
		System.out.println("TimeZone(-12~12): " + today.get(Calendar.ZONE_OFFSET) / (1000*60*60));
		// .getActualMaximum(Calender.DATE)
		System.out.println("이번달의 마지막일자 " + today.getActualMaximum(Calendar.DATE));
		// .get(Calender.DAY_OF_YEAR)
		System.out.println("1년 중 몇 번째 날짜: " +  today.get(Calendar.DAY_OF_YEAR));
	}
}
