package com;

import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		double b,c;
		
		System.out.println("상수 b값을 입력하시오 ");
		b = input.nextFloat();
		
		System.out.println("상수 c값을 입력하시오 ");
		c = input.nextFloat();
		
		double x1 = (-b+Math.sqrt(b*b-4*c))/2;
		double x2 = (-b-Math.sqrt(b*b-4*c))/2;
		
		System.out.println("근의 값은 : " + x1 + " " + x2 + "입니다.");
		
		
		
		
		
		
	}
}
