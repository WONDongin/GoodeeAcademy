package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * MapEx2의 예제를 이용하기
 *
 * 조회를 입력했을 경우
 * 제목,저자,가격순으로 조회되도록 프로그램 수정하기
 *  
 * 검색을 입력했을 경우 
 * 제목,저장,가격으로 검색하도록 프로그램을 수정하기
 * 
 * [결과]
1.추가 2.삭제 3.조회 4.검색 0.종료
3
정렬 방식을 입력하세요 (1.제목 2.저자 3.가격)
1
(춘향전,미상,5000)
(홍길동전,허균,10000)

1.추가 2.삭제 3.조회 4.검색 0.종료
4
도서를 검색합니다.
조회 기준을 입력하세요 (1.제목 2.저자 3.가격)
1 
제목을 입력하세요
홍길동전
조회 정보 : (홍길동전,허균,10000) 입니다.

addBook();  removeBook();   viewBooks();  searchBook();            
 */
class Books{
	String title, author;
	int price;
	public Books(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return title + "," + author + "," + price;
	}
}
public class Test06_M {
	static Map<String, Books> books = new HashMap<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch (menu) {
			case 1: addBook(); break;
			case 2: removeBook(); break;
			case 3: viewBooks(); break;
			case 4: searchBook(); break;
			case 5: System.out.println("시스템 종료"); break;
			default:
				System.out.println("0~5 중 입력하세요.");
			}
		}
	}

	private static void searchBook() {
		if(books.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		System.out.println("도서를 검색합니다.");
		System.out.println("조회 기준을 입력하세요 (1.제목 2.저자 3.가격)");
		int sechNum = scan.nextInt();
		scan.nextLine();
		
		switch (sechNum) {
		case 1: 
			System.out.println("제목을 입력하세요.");
			String title = scan.nextLine();
			if(books.containsKey(title)) {
				System.out.println("조회정보:" + books.get(title) + "입니다.");
			} else {
				System.out.println("해당 도서가 없습니다.");
			} break;
		case 2 : 
			System.out.println("저자을 입력하세요.");
			String author = scan.nextLine();
			// filter 메서드
			books.values().stream()
            .filter(book -> book.author.equals(author))
            .forEach(book -> System.out.println("조회 정보 : " + book + " 입니다."));
			break;
		case 3:
            System.out.println("가격을 입력하세요");
            int price = scan.nextInt();
            scan.nextLine();
            books.values().stream()
                .filter(book -> book.price == price)
                .forEach(book -> System.out.println("조회 정보 : " + book + " 입니다."));
            break;
		default:
			 System.out.println("잘못된 입력입니다.");
		}
		
	}

	private static void viewBooks() {
		if(books.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.println("정렬 방식을 입력하세요 (1.제목 2.저자 3.가격)");
		int viewNum = scan.nextInt();
		scan.nextLine();
		
		List<Books> bookList = new ArrayList<>(books.values());
		bookList.sort((b1,b2) ->{
			switch (viewNum) {
			case 1: return b1.title.compareTo(b2.title);
			case 2: return b1.author.compareTo(b2.author);
			case 3: return Integer.compare(b1.price, b2.price);
			default: return 0;
			}
		});
		bookList.forEach(System.out::println);
	}

	private static void removeBook() {
		System.out.println("삭제 도서제목 입력:");
		books.remove(scan.nextLine());
		System.out.println("도서 삭제완료");
	}

	private static void addBook() {
		System.out.println("도서 추가");
		System.out.print("제목: ");
		String title = scan.nextLine();
		System.out.print("저자: ");
		String author = scan.nextLine();
		System.out.print("가격: ");
		int price = scan.nextInt();
		scan.nextLine();
		books.put(title, new Books(title, author, price));
		System.out.println("도서 추가완료");
	}
}
