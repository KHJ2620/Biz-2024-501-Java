package com.callor.hello;

public class HelloE {

	/*
	 * main() method를 선언하고 
	 * 정수형 숫자 30과 40을 변수에 저장한 후
	 * 4칙 연산 결과를 출력하시오
	 */
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println((float)num1 / num2);

	}
		// 나누기에서 정수 / 정수는 정수형태가 나오기 때문에 
		// 앞에 실수형(float)를 붙여주기
}
