package test240708;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		/*
		 * 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
			단, continue를 이용하여 작성한다.
		 */
		Scanner sc = new Scanner(System.in);
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		for(int i=1; i <= 10; i++) {
			if(array[i] % 2 ==1 ) {
				System.out.println(array[i]);
				sum += array[i];
				
			}
			
		}
		System.out.println("힙계 : " + sum);
		
	}

}
