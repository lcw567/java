package com.kh.view;

import java.util.Scanner;

import com.kh.controller.BookController;
import com.kh.vo.Book;



//사용자와의 소통을 위한 입출력을 담당하는 클래스
public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("********** 메인 메뉴 **********");
			System.out.println("1. 새 도서 등록");
			System.out.println("2. 도서 전체 조회");
			System.out.println("9. 종료");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				this.insertBook();	
				break;
			case 2:
				this.allPrintBook();	
				break;
			case 9:
				System.out.println("도서관리 프로그램 종료");
				return; //1.메소드종료 2.값반환
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void insertBook() {
		//도서정보를 저장
		System.out.println("=== 새 도서 추가 ==");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르(1. 인문 / 2.과학 / 3.외국어 / 4.자기개발 / 5.기타) : ");
		int categoryNumber = sc.nextInt();
		
		String genre = "기타";
		switch(categoryNumber) {
		case 1:
			genre = "인문";
			break;
		case 2:
			genre = "과학";
			break;
		case 3:
			genre = "외국어";
			break;
		case 4:
			genre = "자기개발";
			break;
		}
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book newBook = new Book(title, author, genre, price);
		bc.inertBook(newBook);
	}

}
