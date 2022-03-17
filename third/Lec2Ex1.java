package third;

import java.util.Scanner;

public class Lec2Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("첫 번째 정수를 입하시오.");
		num1 = input.nextInt();
		
		System.out.println("두 번째 정수를 입하시오.");
		num2 = input.nextInt();
		
		if (num1 > num2)
			System.out.println(num1+"이 "+num2+"보다 큽니다.");
		else if (num1 < num2)
			System.out.println(num2+"이 "+num1+"보다 큽니다.");
		else
			System.out.println(num1+"이 "+num2+"와 같습니다.");


		
		
	}

}
