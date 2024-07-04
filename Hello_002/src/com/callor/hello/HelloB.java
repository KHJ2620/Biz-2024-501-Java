package com.callor.hello;

public class HelloB {
	
	/*
	 * 1 ~ 100까지 숫자가 짝수인지 홀수인지 판별하여 출력
	 */
	
	public static void main(String[] args) {
		
		/*
		 * if() else : 조건문을 판별하기
		 * if(참인 조건) else 참이 아닌 경우
		 * 		if(num % 2 == 0 ) 짝수
		 * 		else 짝수가 아님
		 * 이렇게 읽어야 한다
		 */
		
		for(int i=0; i<100; i++) {
			int num = i + 1;           // i+1 을 여러번 쓰지 말고 변수를 이용하자
			if((num)%2 ==1) {
				System.out.println((num) + " : 홀수");
			}else {
				System.out.println((num) + " : 짝수"); // 아니면 짝수
			}
		}
	}
}
