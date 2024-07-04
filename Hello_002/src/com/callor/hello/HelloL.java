package com.callor.hello;

/*
 * 정수형 배열 50개를 선언하고
 * 정수 2 ~ 100 범위의 Random 수를 각각 생성하여
 * 배열 요소에 저장
 * 
 * 배열에 저장된 정수들 중에 prime 수만 합산하여 출력
 * 배열에 저장된 정수들 중에 prime 수가 몇개인가 출력
 */
public class HelloL {

	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int i=0; i<nums.length; i++) {
			nums[i] = 2 + (int)(Math.random()*99);
		}
		int index;
		for(int i=0; i<nums.length; i++ ) {
			for(index=2; index<101; index++) {
				if(nums[i] % index == 0) {
					break;
				}
			}
			
		}
		
	}

}
