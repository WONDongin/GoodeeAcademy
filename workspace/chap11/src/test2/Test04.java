package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * text 문자열에서 이메일을 추출하여 출력하기
  [결과]
  추출된 이메일:
  example_1@gmail.com
  contact@company.co.kr
 */
public class Test04 {
	public static void main(String[] args) {
        String text = "Hello, my email is example_1@gmail.com and my work email is contact@company.co.kr.";
        
        String pass = "([A-Za-z]{7}).([0-9A-Za-z]{1,7}).(\\w{2,5}).(\\w{2,3})";
        
        Pattern p = Pattern.compile(pass);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
        	System.out.println(m.group());
		}
        
    }
}
