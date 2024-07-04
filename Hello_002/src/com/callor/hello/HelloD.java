package com.callor.hello;
/*
 * 1 ~ 100까지 정수 중
 * 짝수들의 전체 합을 계산하여 출력하기
 */
public class HelloD {
	public static void main(String[] args) {
		int sum = 0;  //변수를 for문 밖에서 선언
		for(int i=0; i<100; i++) {
			int num = i+1;
			if(num %2==0) {
				sum += num;				
			}
		}
		System.out.printf("1 ~ 100까지 숫자 중 짝수의 합 : %d\n", sum);
	}
}
