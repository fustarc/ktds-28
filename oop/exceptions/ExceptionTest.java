package com.ktdsuniversity.edu.oop.exceptions;


public class ExceptionTest {

	public static void main(String[] args) {
		
		
		String name = null;
		// name 이라는 인스턴스의 값이 null 이라면 "이름을 입력해주세요"를 출력한다.
		// name 이라는 인스턴스의 값이 null 이 아니라면 값을 출력한다.
		if (name == null) {
			System.out.println("이름을 입력해주세요");
		}		
		else {
			System.out.println(name);
		}
		
		
		String job = "    ";
		// job 이라는 인스턴스의 값이 "" 이라면 "직업을 입력해주세요" 를 출력한다.
		// 아니라면 값을 출력한다.
		if ( 
				
				/* job == null || /* job.isBlank() 버전 11 이상일 경우에만 사용 가능 job.trim().length() == 0 */
				StringUtils.isEmpty(job)
				
				) {
			System.out.println("직업을 입력해주세요");
		} else {
			System.out.println(job);
		}
		
		String address = "";
		String message = StringUtils.emptyToDefault(address, "주소를 입력해주세요");
		System.out.println(message);
		// address라는 인스턴스의 값이 공백으로만 이루어져 있다면 "주소를 입력해주세요"를 출력한다.
		// 아니라면 값을 출력한다.
		
		}
		
		
		
		
		
		
		
		
		/*
		System.out.println("출력을 해봅니다.");
		
//		int number = Integer.parseInt("sasfsadas");
//		System.out.println(number);

		
		int[] n = new int[3];
		
		n[0]=10;
		n[2]=30;
		n[3]=540;
		
		System.out.println("출력이 종료되었습니다.");
		*/
	
}
