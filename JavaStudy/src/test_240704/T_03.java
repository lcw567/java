package test_240704;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, max, min;
		
		
		System.out.println("첫번째 숫자 : ");
		num1 = sc.nextInt()	;	
		
		System.out.println("두번째 숫자: ");
		num2 = sc.nextInt()	;
		
		max = (num1 > num2) ? num1: num2;
		min = (num1 > num2) ? num2: num1;
	
		if (min <1 ||max <1) {
			System.out.println("1 이상의 숫자를 입력하시오");
		}else {
			
		for(int i =min; i <= max; i++) {
			System.out.println(i + " ");
		}
		}
	}
	}

