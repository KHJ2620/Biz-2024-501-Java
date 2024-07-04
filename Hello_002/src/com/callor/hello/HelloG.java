package com.callor.hello;

public class HelloG {

	public static void main(String[] args) {
		
		int index = 0;
		for(;;) {
			if(index++ > 99) {  // 100이 되면 break
				break;
			}
			System.out.println("Hello Korea");
		}
		
		for(int i=0; i<100; i++) {
			System.out.println("Hello Korea");
		}

	}
		// 위 두 코드가 같은 코드임
}
