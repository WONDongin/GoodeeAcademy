package ex4_lterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx1 {
	public static void main(String[] args) {
		// List<Object> fruits = new Vector<>();
		Vector<Object> fruits = new Vector<>();
		fruits.add("Alice");
		fruits.add("Bob");
		fruits.add("Charlie");
		fruits.add("David");
		// elements() : Vector 클래스의 멤버
		Enumeration<Object> e = fruits.elements();
		System.out.println("과일 목록: ");
		print(e);
	}

	private static void print(Enumeration<Object> e) {
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + ",");
		}
		System.out.println();
	}
}