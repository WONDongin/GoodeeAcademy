package ex8_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
Arrays 클래스 : 배열의 복사, 비교, 정렬 기능을 가진 클래스 
*/
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"홍길동", "이몽룡", "성춘향", "향단이"};
		for(String string : arr1) {
			System.out.print(string + ",");
		}
		// Arrays.toString
		System.out.println();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		// Arrays.fill : 배열 모든값 변경
		Arrays.fill(arr1, "김삿갓");
		System.out.println(Arrays.toString(arr1));		
		// arr2 배열의 값을 10 저장
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
		// 인덱스 1, 2 지정하여  홍길동전 
		Arrays.fill(arr1,  1, 3, "홍길동전");
		System.out.println(Arrays.toString(arr1));	
		// 인덱스 2, 3 지정하여   100
		Arrays.fill(arr2, 2, 4, 100 );
		System.out.println(Arrays.toString(arr2));
		
		// Arrays.sort() : 배열 정렬
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		// Comparator.reverseOrder : 내림차순
		Arrays.sort(arr1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}
