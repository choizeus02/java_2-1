package third;
import java.util.Scanner;

public class DayslnMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		
		System.out.println("월을 입력하시오.");
		
		month = input.nextInt();
		
		switch (month)
		{
			
		case 2:
			System.out.println("28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 있습니다.");
			break;
		default:
			System.out.println("31일까지 있습니다.");
			break;
		}
		
	}

}
