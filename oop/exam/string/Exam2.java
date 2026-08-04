package com.ktdsuniversity.edu.oop.exam.string;

public class Exam2 {
	
	
	/*

	//https://school.programmers.co.kr/learn/courses/30/lessons/181842
	public int solution(String str1, String str2) {
        
        boolean isSolution = str2.contains(str1);
        System.out.println(isSolution);
        int answer = isSolution ? 1 : 0;
        return answer;
        
        
    }
    
    //https://school.programmers.co.kr/learn/courses/30/lessons/181843
    public int solution(String my_string, String target) {
        int answer = 0;
        answer = my_string.contains(target) ?  1 : 0;
        return answer;
    }
    
    //https://school.programmers.co.kr/learn/courses/30/lessons/181845    
    public String solution(int n) {    
        String answer = "" + n;
     
        return answer;
    }
    
    //https://school.programmers.co.kr/learn/courses/30/lessons/181848
    public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    } 
	
	//https://school.programmers.co.kr/learn/courses/30/lessons/181847
	public String solution(String n_str) {
		int str = 0;
		str = Integer.parseInt(n_str);
		String answer = (""+str);
        return answer;

	}
	*/
    //https://school.programmers.co.kr/learn/courses/30/lessons/181849
	public int solution(String num_str) {
		String str = "";
		String[] arrays = str.split(num_str);
		int answer = 0;
		for( int i = 0; i < arrays.length; i++) {
			answer += Integer.parseInt(arrays[i]);
		}
		return answer;
    }

}
