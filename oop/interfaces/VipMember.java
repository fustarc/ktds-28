package com.ktdsuniversity.edu.oop.interfaces;

public class VipMember implements VipMemberService {

	@Override
	public void join() {
		System.out.println("VIP 회원 가입 되었습니다.");
		
	}

	@Override
	public void login() {
		System.out.println("VIP 회원 로그인 되었습니다.");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("VIP 회원 탈퇴 완료되었습니다.");
		
	}

	@Override
	public void logout() {
		System.out.println("VIP 회원 로그아웃 완료 되었습니다.");
		
	}

	@Override
	public void addPoint(int point) {
		System.out.println(point + " 점 지급되었습니다.");
		
	}

}
