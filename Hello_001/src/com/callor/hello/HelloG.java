package com.callor.hello;


/*
 * main() method를 만들고 
 * 정수 1~10까지 숫자를 console에 출력하기
 * 
 * 출력할 때는 i=0부터 시작해야하고 <= 보다 < 쓰는 것이 좋음(출력문에서 수정해주기)
 */

public class HelloG {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+1);
		}
		System.out.println("=".repeat(30)); // =을 30번 반복
		
		/*
		 * 1~10까지 정수를 
		 * 1,2,3, ... 10 가로 방향으로 출력하기
		 */
		for(int i =0; i<10; i++) {
			System.out.print(i+1);
			if(i+1 <10) {
			System.out.print(", ");
			}
		}
		// = 표시 30개짜리 줄을 출력하기 전에 Enter를 출력하여
		// 줄바꿈 효과를 내라
		System.out.println("\n" + "=".repeat(30));
	
	
	/* 
	 * 1 ~ 100까지 숫자를 1 2 3 처럼 빈칸으로 구분하여 출력
	 * 단. 5개의 숫자를 출력한 후 줄바꿈하기
	 * 		1 2 3 4 5
	 * 		6 7 8 9 10 형식으로 출력
	 */
	
	for(int i=0; i<100; i++) {	
		if((i+1)%5 == 0) {
			System.out.println(i+1 + " ");
		} else {
			System.out.print(i+1 + " ");
		}
	}
	System.out.println("\n" + "=".repeat(30));
	
	for(int i=0; i<100; i++) {
		System.out.print(i+1 + " ");
		if((i+1)%5 == 0) {
			System.out.println();
		}
	}
	}
}
