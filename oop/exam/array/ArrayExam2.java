package com.ktdsuniversity.edu.oop.exam.array;

import java.util.Arrays;

public class ArrayExam2 {
	/*
	// https://school.programmers.co.kr/learn/courses/30/lessons/181941
	// 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
	public String solution(String[] arr) {
        String answer = "";
        return answer.join("", arr);
    }
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181852
	// 정수로 이루어진 리스트 num_list가 주어집니다. 
	// num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	public int[] solution(int[] num_list) {
        Arrays.sort(num_list);        
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        return answer;
    }
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181853
	// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 
	// return하도록 solution 함수를 완성해주세요.
	public int[] solution(int[] num_list) {
        Arrays.sort(num_list); 
        int[] answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }
	
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181854
	// 정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
	// arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
	public int[] solution(int[] arr, int n) {
		//1. arr의 length 를 파악
		int lengthArr = arr.length;
		
		//2. lengthArr이 짝수 일 때 모든 홀수 인덱스 위치에 n을 더하게 함
		if (lengthArr %2 == 0 ) {
			for (int i = 1; i < arr.length; i += 2) {
				arr[i] += n;
			}			
		}
		//3. lengthArr이 홀수 일 때 모든 짝수 인덱스 위치에 n을 더하게 함
        else {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] += n;
            }
        }
        return arr;
    }
		
	
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181856
	// 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
	// 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
	// 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
	// 두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1,
	// 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.

	public int solution(int[] arr1, int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;
		
		if (arr1.length > arr2.length) {
			return 1;
		}
		else if (arr1.length < arr2.length) {
			return -1;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
			sum2 += arr2[i];
		}
		if (sum1 > sum2) {
			return 1;
		}
		else if (sum1 < sum2) {
			return -1;
		}
		else {
			return 0;
		}
		
    }
	
	*/
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181861
	// 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, 
	// arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 
	// 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.

	public int[] solution(int[] arr) {
	
		//1. arr 배열의 길이의 수 까지 for 문 반복하여 배열에 숫자 넣기
		for (int i = 0; i < arr.length; i++) {
			//2. 
			int a = arr[i];
			
			for (int j = 0; j < a; j++) {
				
			}
		}
		
        int[] answer = {};
        return answer;
    }

}






























