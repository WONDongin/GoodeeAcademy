package ex10_calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
년도와 월을 입력 받아서 년월의 마지막 일자와 요일 출력하기
Calender 객체 이용하기 
*/
public class Exam1 {
	public static void main(String[] args) {
		System.out.print("년도와 월을 입력하세요: ");
		Scanner sc  = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		Calendar cl = Calendar.getInstance(); // 현재 일시
		String week = "일월화수목금토";
		
		cl.set(year, (month -  1), 1); // 입력월의 1일
		// 입력월의 마지막일자
		int lastDay = cl.getActualMaximum(Calendar.DATE);
		cl.set(year, (month -  1), lastDay); 
		
		System.out.printf("%4d-%02d-%02d %c요일\n", 
				cl.get(Calendar.YEAR),
				(cl.get(Calendar.MONTH) + 1),
				cl.get(Calendar.DATE), 
				week.charAt(cl.get(Calendar.DAY_OF_WEEK) -1));
	}
}
