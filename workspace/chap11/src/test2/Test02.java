package test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 날짜를입력하세요. (yyyy-MM-dd)");
        String day1 = sc.nextLine();
        
	    SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd");
		Date today1 = null;
		
		try {
			today1 = sf.parse(day1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// String a = sf.format(today1);
		
		
		System.out.println("두번째 날짜를입력하세요. (yyyy-MM-dd)");
        String day2 = sc.nextLine();
        
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date today2 = null;
		
		try {
			today2 = sf.parse(day2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		today1.setTime(   (today2.getTime() - (today1.getTime()) -  (1000L*60*60*24) ));
		System.out.println(new SimpleDateFormat("dd").format(today1));
		
 

	}
}
