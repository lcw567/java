package a.basic;
import java.util.Scanner;
//1) Scanner를 사용하기 위해서 외부로 부터 가져온다.

public class Input {
	/*
	 * 키보드로 값을 입력하는 방법
	 * Sxanner를 사용
	 * (java.util.Scanner 클래스를 이용한다)
	 * 
	 * [사용법]
	 * Scanner 이름 new Scanner(System.in);
	 * ex) 	Scanner sc = new Scanner(System.in);
	 * 
	 * sc.next(): 사용자가 입력한 값중 공백이 있을경우 공백 이전까지의 값만 가져온다.
	 * sc.nextLine() : 사용자가 입력한 값중 \n(개행문자)를 포함하는 한 라인을 읽고 \n 버린 나머지값 가져온다.
	 * 
	 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong()
	 * sc.nextFloat(), sc.nextDouble(),
	 * 위처럼 정수나 실수를 입력받는 코드를 작성했을 때 \n토큰이 함께 들어오기 때문에
	 * sc.nextLine()을 통해 비워주는 코드를 작성해야 한다.
	 * 
	 * sc.close(); //더 이상 Scanner를 사용하지 않는다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1, str2 ;
     	str1 = sc.next();
     	sc.nextLine(); // 버퍼에서  \n(엔터값)을 비워주는 코드

		str2 = sc.nextLine();
	
        System.out.println("입력한 값 : " + str1);
        System.out.println("입력한 값 : " + str2);
        
		System.out.println("---------------------------");
		String name, adress;
		int age;
		float height;
		
		System.out.println("이름을 입력해 주세요 : ");
		name =sc.next();
		sc.nextLine();
		
		System.out.println("나이를 입력해 주세요 : ");
		age =sc.nextInt();
		sc.nextLine();
		
		System.out.println("키를 입력해 주세요 : ");
		height =sc.nextFloat();
		sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("---------------------------");
	
        sc.close();
	
	
	}
}
