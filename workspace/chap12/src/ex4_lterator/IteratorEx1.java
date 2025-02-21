package ex4_lterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
Iterator 인터페이스 : 반복자
Iterator() : Collection 객체는 Iterator 객체로 변환이 가능하다.
주요메서드
boolean hasNext() : 조회할 요소가 있는지 true/false
Object next() : 조회 대상 객체 리턴
void remove() : 조회된 객체를 제거, next() 실행 이후에 가능

Enumeration 인터페이스 : Iterator 이전의 반복자. Vector, Hashtable 에서만 사용이 가능함.
메서드
boolean hasNextElement() : 조회할 요소가 있는지
Object nextElement() : 조회 대상 객체 리턴

 
*/
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator<Object> it = null;
		List<Object> list = new ArrayList<>();
		Set<Object> set = new HashSet<>();
		
		for(int i = 1; i <= 5; i++) {
			list.add(i+10);
			set.add(i*10);
		}
		
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		// remove() 사라져서, [] 출력
		System.out.println("print() 이후의 list:" + list);
		System.out.println("print() 이후의 set:" + list);
	}
	
	private static void print(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
			it.remove();
		}
		System.out.println();
	}
}
