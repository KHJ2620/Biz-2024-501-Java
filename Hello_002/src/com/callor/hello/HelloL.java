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
		
		int primeSum = 0;
        int primeCount = 0;
        
		for(int i=0; i<nums.length; i++ ) {	
			boolean isPrime = true;
			for(int j = 2; j < nums[i]; j++) {
				if (nums[i] % j == 0) {
					 isPrime = false;
                     break;
				}
			}
			if (isPrime) {
	            primeSum += nums[i];
	            primeCount++;
	        }
		}
		System.out.println("배열에 저장된 소수의 합 : " + primeSum);
        System.out.println("배열에 저장된 소수의 개수 : " + primeCount);
	}

}
