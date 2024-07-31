package study.list.book;
//도서 정보를 담을 클래스 선언(Book)
//
//도서 제목 (중복 없음)
//도서 가격
//도서 저자
//CRUD 관련 기능을 담아놓을 클래스 선언(Library)
//
//도서 추가
//도서 삭제
//도서 가격이 평균 가격보다 낮은지 검사
//도서 전체 조회
//도서 제목으로 도서 정보 조회

public class Page {
	public static void main(String[] args) {
		Library library = new Library();

		// 도서 추가
		library.addBook(new Book("동화책", 1000, "Author1"));
		library.addBook(new Book("소설책", 2000, "Author2"));
		library.addBook(new Book("만화책", 1500, "Author3"));

		// 도서 전체 조회
		System.out.println(library.findAll());

		// 도서 가격이 평균 가격보다 낮은지 검사
//		System.out.println(library.checkPrice("만화책"));
		// 도서 제목으로 도서 정보 조회
		Book foundBook = library.findBookByTitle("소설책");
		if (foundBook != null) {
			System.out.println("찾은 책: " + foundBook);
		} else {
			System.out.println("책이 없습니다.");
		}
//
//		// 도서 삭제
		library.removeBook("만화책");
		System.out.println(library.findAll());
	}
}
