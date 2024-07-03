package com.callor.hello;

public class HelloF {

	/*
	 * main method()를 선언하고
	 * 정수 30과 40을 변수에 저장하고
	 * 1. 정수 30과 40을 덧셈하고
	 * 2. 정수 30과 덧셈한 결과를 뺄셈하고
	 * 3. 정수 40과 뺄셈한 결과를 곱셈하고
	 * 4. 덧셈한 결과와 뺄셈한 결과를 나눗셈
	 */
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;
		int result1 = num1 - sum;
		int result2 = num2 * result1;
		double result3 = (double)sum / result1;
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, sum, result1);
		System.out.printf("%d * %d = %d\n", num2, result1, result2);
		System.out.printf("%d ÷ %d = %.2f\n", sum, result1, result3);
		
		// printf로 출력 format을 지정할 수 있음
		// %d 정수형, \n 줄바꿈, .2f 실수형(소수점 둘째자리)

	}

}
