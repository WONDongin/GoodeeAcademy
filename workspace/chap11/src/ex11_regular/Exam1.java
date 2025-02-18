package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
data 문자열 중 점수를 찾아서 총점과 평균을 출력하기 
*/
public class Exam1 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		String sp = "([0-9]{2,3})";
		// [ㄱ-힣]+ : 한글
		
		Pattern p = Pattern.compile(sp);
		Matcher m = p.matcher(data);
		
		int sum  = 0;
		int count = 0;
		
		while(m.find()) {
			int  num = Integer.parseInt(m.group());
			sum +=num;
			count++;
		}
		
		System.out.println("총점: " + sum);
		double avg = (double) sum / count;
		System.out.println("평균: " +avg);
	}
}
