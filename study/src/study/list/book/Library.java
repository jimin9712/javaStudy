package study.list.book;

import java.util.ArrayList;

import study.list.DBConnecter;

public class Library {

	// 도서 추가
	public void addBook(Book book) {
		// DBConnecter의 books 리스트에 새 도서를 추가
		DBConnecter.books.add(book);
	}

	// 도서 삭제
	public void removeBook(String book) {
		// DBConnecter의 books 리스트에서 도서 제목으로 도서를 삭제
		DBConnecter.books.remove(book);
	}

	// 도서 가격이 평균 가격보다 낮은지 검사
	public Book checkPrice(Book book) {
		int total = 0;
		double avr = 0.0;

		// 전체 도서 가격을 합산
		for (int i = 0; i < DBConnecter.books.size(); i++) {
			total += DBConnecter.books.get(i).getPrice();
		}

		// 평균 가격 계산
		avr = (double) total / DBConnecter.books.size();

		// 입력된 도서의 가격이 평균 가격보다 낮으면 해당 도서를 반환, 그렇지 않으면 null 반환
		return book.getPrice() < avr ? book : null;

	}

	// 도서 전체 조회
	public ArrayList<Book> findAll() {
		// DBConnecter의 books 리스트를 복제하여 반환
		return (ArrayList<Book>) DBConnecter.books.clone();
	}

	// 도서 제목으로 도서 정보 조회
	public Book findBookByTitle(String title) {
		// DBConnecter의 books 리스트에서 주어진 제목과 일치하는 도서를 검색하여 반환
		for (Book book : DBConnecter.books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		// 일치하는 도서를 찾지 못하면 null 반환
		return null;
	}

}
