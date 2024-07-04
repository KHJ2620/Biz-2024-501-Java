package com.callor.hello;
/*
 * 2 ~ 100까지 범위의 임의 Random 를 1개를 만들고
 * 그 수가 prime 인지 아닌지 판단
 * 
 * 
 */
public class HelloK {
	public static void main(String[] args) {
		int num = 2 + (int)(Math.random()*99);
		int index;
		for(index=2; index<num; index++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.out.println(num + " 는 소수 아님");
		}else {
			System.out.println(num + " 는 소수");
		}
	}
}
