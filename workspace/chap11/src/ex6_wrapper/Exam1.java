package ex6_wrapper;


/*
  str 문자열의 숫자의 합 출력하기
*/
public class Exam1 {
	public static void main(String[] args) {
		String str = "10,20, 30, 40, 50, 60";
		String[] arr = str.split(","); // split " 제거
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i].trim()); // trim : 공백제거
		}
		
		System.out.println(" 문자열의 숫자의 합 = " + sum);
	}
}
