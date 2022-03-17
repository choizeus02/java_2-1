package third;

import java.util.Scanner;


public class Int2Hwd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("숫자를 입력하시오.");
		
		num = input.nextInt();
		
		switch (num)
		{
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		case 4:
			System.out.println("넷");
			break;
		case 5:
			System.out.println("다섯");
			break;
		case 6:
			System.out.println("여섯");
			break;
			
		}
		
		
		
	}
	

}
