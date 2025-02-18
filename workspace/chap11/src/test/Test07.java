package test;

/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */
public class Test07 {
	public static void main(String[] args) {
		String str = "1,234";
		// .replace(",", "") : 문자열 , → "" 으로 변경
		int num = Integer.parseInt(str.replace(",", ""));
		//%,d : 세자리마다 , 표시
		System.out.println(String.format("%,d", num*10));
	
	}
}
