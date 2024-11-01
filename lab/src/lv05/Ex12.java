package lv05;

import java.util.Scanner;

public class Ex12 {
	/*
	 * # 단어 교체하기(replace)
	 * 1. text변수 문장속에서 변경하고 싶은 단어를 입력받아,
	 * 2. 교체해주는 기능을 구현한다.
	 * 예)
	 * 		Life is too too short.
	 * 		변경하고 싶은 단어입력 : Life
	 * 		바꿀 단어입력 : Time
	 * 		
	 * 		Time is too short.
	 */
	
	// replace() 메서드 사용 X
	// too -> how
	// Life is how how short.
	// .-> !!!
	// Life is too short!!!
	// Life -> My height
	// My height is too short.
	// short -> long
	// Life is too too long.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = sc.nextLine();
		
		System.out.print("변경할 단어를 입력하세요 : ");
		String newWord = sc.nextLine();
		int cnt = 0;
		int idx = 0;
		for(int i=0; i<text.length(); i++) {
			if(word.charAt(cnt) == text.charAt(i)) {
				cnt++;
				if(cnt == word.length()) {
					idx = i-cnt;
					text = text.substring(0, idx+1) + newWord + text.substring(idx+word.length()+1);
					cnt = 0;
				}
			}else {
				cnt = 0;
			}
		}
		System.out.println(text);
	}

}
