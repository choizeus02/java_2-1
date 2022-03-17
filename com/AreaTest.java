package com;


import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius;
		double PI = 3.141592;
		double area;
		
		System.out.println("반지름을 입력하시오");
		radius = input.nextInt();
		area = PI * radius * radius;
		
		System.out.println("반지름이"+radius+"인 원의 면적"+area+"입니다");
		
	}
}
