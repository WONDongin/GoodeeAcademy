package test;

/*
 * s1,s2 문자열을 분리하여 다음과 같이 결과가 나오도록 코딩하기
[결과] 
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/
public class Test06 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		
		// spilt("-") - 기준으로 문자열 분리
		String[] arr1 = s1.split("-");
		String[] arr2 = s2.split(",");
		
		// \\s* : 공백0개이상 => 정규식 : 문자의 특성을 기호표시
		arr2 = s2.split("\\s*,\\s*");
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%s => %s\n",  arr1[i], arr2[i].trim());
		}
	}
}