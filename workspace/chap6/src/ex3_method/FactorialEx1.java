package ex3_method;
/*
 	재귀함수 : Recurcive call
 				 자신의 함수를 호출하는 함수
 				 4! = 4*3*2*1
 				 
 				 스텍 메모리 구조 : 선입후출
*/
public class FactorialEx1 {
	public static void main(String[] args) {
		System.out.println("4!=" + factorial(4)); // 24
	}
	
	private static int factorial(int i) { //재귀 함수
		return (i==1) ? 1 : i*factorial(i - 1);
	}
}
