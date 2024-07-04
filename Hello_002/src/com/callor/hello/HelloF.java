package com.callor.hello;

/* 
 * 아래 코드에 별도의 변수를 선언하지 않고
 * prime 수인지를 검사하는 코드를 완성
 */

public class HelloF {
	public static void main(String[] args) {
		int num = 7;
		for(int i=2; i< num/2; i++) {
			if(num % i == 0) {
				System.out.println(num + " 는 소수가 아님");
			}else {
				System.out.println(num + " 는 소수");
			}
		}
		System.out.println("=".repeat(30));
		
		int index;
		for(index=2; index<num; index++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + " 는 소수 아님"); //for문에서 break가 걸렸기 때문에 index가 num보다 작게 됨
		}else {
			System.out.println(num + " 는 소수"); //for문에서 break가 걸리지 않고 완전히 통과했기 때문에 index랑 num이 같아짐
		}
	}
}
