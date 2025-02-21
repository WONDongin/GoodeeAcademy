package test;

import java.util.*;
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
 */
class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + title + "," + author + "," + price + ")";
    }
}

public class Test06_L {
    static List<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    viewBooks();
                    break;
                case 4:
                    searchBook();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void addBook() {
        System.out.println("제목 입력:");
        String title = sc.nextLine();
        System.out.println("저자 입력:");
        String author = sc.nextLine();
        System.out.println("가격 입력:");
        int price = sc.nextInt();
        sc.nextLine();
        books.add(new Book(title, author, price));
        System.out.println("도서가 추가되었습니다.");
    }

    public static void removeBook() {
        System.out.println("삭제할 도서 제목 입력:");
        String title = sc.nextLine();
        books.removeIf(book -> book.title.equals(title));
        System.out.println("도서가 삭제되었습니다.");
    }

    public static void viewBooks() {
    	// List 객체에 요소가 없는 경우
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("정렬 방식을 입력하세요 (1.제목 2.저자 3.가격)");
        int sortOption = sc.nextInt();
        sc.nextLine();
        
        books.sort((b1, b2) -> {
            switch (sortOption) {
                case 1: return b1.title.compareTo(b2.title);
                case 2: return b1.author.compareTo(b2.author);
                case 3: return Integer.compare(b1.price, b2.price);
                default: return 0;
            }
        });
        
        books.forEach(System.out::println);
    }

    public static void searchBook() {
        System.out.println("도서를 검색합니다.");
        System.out.println("조회 기준을 입력하세요 (1.제목 2.저자 3.가격)");
        int searchOption = sc.nextInt();
        sc.nextLine();
        
        switch (searchOption) {
            case 1:
                System.out.println("제목을 입력하세요");
                String title = sc.nextLine();
                books.stream()
                    .filter(book -> book.title.equals(title))
                    .forEach(book -> System.out.println("조회 정보 : " + book + " 입니다."));
                break;
            case 2:
                System.out.println("저자를 입력하세요");
                String author = sc.nextLine();
                books.stream()
                    .filter(book -> book.author.equals(author))
                    .forEach(book -> System.out.println("조회 정보 : " + book + " 입니다."));
                break;
            case 3:
                System.out.println("가격을 입력하세요");
                int price = sc.nextInt();
                sc.nextLine();
                books.stream()
                    .filter(book -> book.price == price)
                    .forEach(book -> System.out.println("조회 정보 : " + book + " 입니다."));
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}