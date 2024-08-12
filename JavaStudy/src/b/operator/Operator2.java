package b.operator;

public class Operator2 {
    /*
     * 증감 연산자 
     * ++ 값을 1 증가
     * -- 값을 1 감소
     * 
     * (증감연산자)변수 :  전위 연산 -> "선증감" 후처리
     * 변수(증감연산자) :  후위 연산 -> "선처리" 후증감
     */
	
	public static void main (String[] args) {
		int num1 = 0;
		
		System.out.println(num1++);// 답:0(1)
		System.out.println(++num1);// 2(2)
		System.out.println(num1--);// 2(1)
		System.out.println(++num1);// 2(2)
		System.out.println(++num1);// 3(3)
		System.out.println(num1++);// 3(4)
		System.out.println(num1--);// 4(3)
		System.out.println(--num1);// 2(2)
		System.out.println(--num1);// 1(1)
	}
}
