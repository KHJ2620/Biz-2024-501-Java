package com.callor.word.exec;

import java.util.Scanner;

/*
 * 키보드를 통하여 학생이름, 국어, 영어, 수학 성적을
 * 차례로 입력받고
 * 
 * ================================================
 * 학생이름 : 000
 * 국어 : 000
 * 영어 : 000
 * 수학 : 000
 * ------------------------------------------------
 * 총점 : 000
 * 평균 : 000
 * ================================================
 */
public class ScannerB {
	public static void main(String[] args) {
		System.out.println("=".repeat(30));		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = scan.nextLine();
		System.out.print("국어 : ");
		int korean = scan.nextInt();
		System.out.print("영어 : ");
		int English = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();		
		System.out.println("-".repeat(30));
		
		int sum = korean + English + math;
		System.out.println("총점 : " + sum);
		double average = (double)sum / 3;
		System.out.println("평균 : " + average);
		System.out.println("=".repeat(30));
	}
}
