package com.callor.hello;

public class HelloA {
	
	/* 
	 * main() method 생성하고 
	 * 1 ~ 100까지 숫자 중 짝수만 출력하기
	 * 
	 */
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if((i+1)%2 == 0)
			System.out.print((i+1) + " ");
		}

	}

}