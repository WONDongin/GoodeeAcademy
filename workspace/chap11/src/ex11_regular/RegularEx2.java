package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
정규 표현식 예제

. : 문자한개
? : 0 또는 1개
* : 0개 이상
+ : 1개 이상
^[A-Z] : 문자열의 시작
^[..] : 문자열의 시작       ^[0-9] : 숫자로 시작하는 경우
[^..] : 지정된 문자 제외  [^0-9] : 숫자가 아닌 경우
| : 또는, OR.   02 | 010 : 02 또는 010 인경우
& : and
() : 그룹
\s : 공백 한개
\S :  공백이 아닌 문자 한개
\d : 숫자 한개. [0-9] 같은의미
\D : 숫자가 아닌 경우 [^0-9]
\w : 일반문자 [0-9A-Za-z]
\W : 특수문자
{n} : n개
{n,} : n개 이상
{n,m} : n이상 m개 이하 
*/
public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = {".", "[a-z]?", "[0-9]+", "^[0-9]",
																	  "[a-z]*", "[a-z]+", "02|010",
																	  "\\s", "\\S", "\\d",
																	  "\\w", "\\W"};
		String[] datas = {"", "a", "1", "12", "012", "abc", "02", " ", "A", "5", "a", "*"};
		for(String s : datas) {
			if(s.equals("")) {
				System.out.print("빈문자열 \"\" 패턴=>");
			} else if (s.equals(" ")) {
				System.out.print("공백문자 \" \" 패턴=>");
			} else {
				System.out.print(s + " 문자의 패턴 =>");
			}
			
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(s);
				if(m.matches()) {
					System.out.print(p + ", ");
				}
			}
			System.out.println();
		}
		
	}
}
