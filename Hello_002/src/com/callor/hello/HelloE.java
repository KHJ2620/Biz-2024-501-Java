package com.callor.hello;

public class HelloE {

	/*
	 * prime(int num) method를 생성하고
	 * 매개변수로 전달받은 num의 값이 소수인지 판별하여 
	 * 결과를 return 하기
	 */
	public static void main(String[] args) {
		boolean r = isPrime(3);
		System.out.println(r);

	}
	
	public static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
