package com.ktdsuniversity.edu.oop.exam.string;

import java.util.Scanner;

public class Shiritori {
	
	public static void main(String[] args) {
		
		//1. 시작 단어 자전거로 지정
		String startWord = "자전거";
		
		//2. 시작단어 출력
		System.out.println(startWord);
		
		//3. 시작단어의 마지막 글자를 찾아 저장
		String wordSaver = startWord.substring(startWord.length() -1);
		
		int relayCount = 0;
		
		//System.out.println(wordSaver); // 마지막 글자 테스트용
		//4. 스캐너 생성
		Scanner keyboard = new Scanner(System.in);
		String nextWord = null;
		
		while (true) {			
			
			//5. 이전 단어의 마지막 글자로 시작하는 다음 단어 입력
			nextWord = keyboard.nextLine();
			//좌우 공백 제거
			nextWord = nextWord.trim();
			//전체 공백 제거
			//nextWord = nextWord.replace(" ", "");
		
			//6. 입력 단어가 이전 단어의 마지막 글자로 시작되는지 확인
			//7. 입력 단어가 3글자 이상인지 확인
			if(nextWord.startsWith(wordSaver) && nextWord.length() >= 3) {
					
					//8. 단어 출력
					System.out.println(nextWord);					
					//9. 입력 단어의 끝 글자를 저장
					wordSaver = nextWord.substring(nextWord.length()-1);
					
					relayCount++;
				} else {
					System.out.println("게임 종료, "+ relayCount + "회 성공");	
					break;
				}
			
			}
		}
}


