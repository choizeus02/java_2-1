package com;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int year;
		boolean b;
		System.out.println("확인할 연도를 입력하시오");
		year = input.nextInt();
		b = true;
		
		b = (year % 4 == 0);
		if(b == true)
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다.");
	}
}
