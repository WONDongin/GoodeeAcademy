package ex4_lterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*
Map 객체의 Iterator 

*/
public class IteratorEx2 {
	public static void main(String[] args) {
		Map<Object, Object> students = new Hashtable<>();
		students.put(101, "Alice");
		students.put(102, "Bob");
		students.put(103, "Charlie");
		students.put(104, "David");
		// key 값만 Iterator 객체로 변환가능
		Iterator<Object> it = students.keySet().iterator();
		// Iterator<Object> it == students.iterator(); Map 객체는 Iterator 객체로 변환 불가
		print(it);
		System.out.println("print 이후의 students 객체: " + students);
		
		students = new Hashtable<>();
		students.put(101, "Alice");
		students.put(102, "Bob");
		students.put(103, "Charlie");
		students.put(104, "David");
		it = students.values().iterator();
		print(it);
		System.out.println("print 이후의 students 객체: " + students);
	}

	private static void print(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
			it.remove();
		}
		System.out.println();
	}
}
