package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
년도와 월을 입력받아서 월의 마지막 일자와 마지막일의 요일 출력하기 
*/
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도입력: ");
		int  year = sc.nextInt();
		
		System.out.print("월 입력: ");
		int  moth = sc.nextInt();
		
		// 다음달 1일
		String dateStr =  year + "-" + (moth+1) + "-01";
	    SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		
		try {
			day = sf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// setTime: 값리턴, getTime 값 받기?
		// 24(시간) * 60(분) * 60(초) * 1000
		day.setTime(day.getTime() - (1000*60*60*24)); // 다음달 1일 -1일 : 이번달 마지막일
		// day 값 전달받아 format 넣기
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));

	}
}
