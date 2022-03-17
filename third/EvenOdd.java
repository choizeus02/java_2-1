package third;

import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("정수를 입력하시오");
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("입력된 정수는 짝수 입니다.\n");
		else
			System.out.println("입력된 정수는 홀수 입니다.\n");
		
		System.out.println("프로그램이 종료되었습니다. ");
		
	}
		

}
