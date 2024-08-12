package project2;

import java.util.Scanner;


public class ClassMenu {
	Scanner sc = new Scanner(System.in);
	
	ClassController cc = new ClassController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("=====수강신청 프로그램=====");
		System.out.println(" 1. 수강 신청 ");
		System.out.println(" 2. 수강 취소 ");
		System.out.println(" 3. 강의 검색 ");
		System.out.println(" 4. 수강 정보 조회 ");
		System.out.println(" 5. 전체 강의 출력 ");
		System.out.print("번호 입력 : ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			addClass();
			break;
		case 2:
			delectClass();
			break;
		case 3: 
			serchClass();
			break;
		case 4:
			checkClass();
			break;
		case 5:
			printClass();
			break;
		default:
			System.out.println("잘못 입력했습니다 다시 입력하시오");
			

		}
	}
}

	private void addClass() {
		// TODO Auto-generated method stub
		
	}

	private void delectClass() {
		// TODO Auto-generated method stub
		
	}

	private void serchClass() {
		// TODO Auto-generated method stub
		
	}

	private void checkClass() {
		// TODO Auto-generated method stub
		
	}

	private void printClass() {
		// TODO Auto-generated method stub
		
	}

	



	
}
