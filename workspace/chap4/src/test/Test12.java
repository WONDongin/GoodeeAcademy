package test;

import java.util.Scanner;

/*
 * 가로 구구단 출력하기
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 * 2단 2단 4단
 * 2*2 = 4 
 */
public class Test12 {
	public static void main(String[] args) {
		
			System.out.println("가로 구구단 출력하기");
			
			for (int i = 1; i <= 9; i++) { // 행 
	            for (int j = 2; j <= 9; j++) { // 열 
	                System.out.printf("%d * %d = %2d\t", j, i, j * i);
	            }
	            System.out.println(); 
	        }
		}
	
}
