package test240723.object2;

import java.util.Scanner;

public class NumberMenu {
	  public void menu() {
	        Scanner sc = new Scanner(System.in);
	        NumberController controller = new NumberController();

	        try {
	            System.out.print("정수1: ");
	            int num1 = Integer.parseInt(sc.nextLine());
	            System.out.print("정수2: ");
	            int num2 = Integer.parseInt(sc.nextLine());

	            boolean result = controller.checkDouble(num1, num2);
	            System.out.printf("%d은(는) %d의 배수인가? %b\n", num1, num2, result);

	        } catch (NumberFormatException e) {
	            System.out.println("정수를 입력해주세요.");
	        } catch (NumRangeException e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        } finally {
	        	sc.close();
	            System.out.println("프로그램을 종료합니다.");
	        }
	    }
	}
