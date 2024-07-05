package com.callor.word.models;

/* 
 * 영어 단어, 한글 풀이를 저장할 Data Class
 */

public class WordVO {
	public String english;
	public String korean;
	@Override
	public String toString() {
		return "wordVO [english=" + english + ", korean=" + korean + "]";
	}
	
	
}
