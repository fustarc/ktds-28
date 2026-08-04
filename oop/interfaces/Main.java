package com.ktdsuniversity.edu.oop.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		//ArticleSystem is a ArticleService
		ArticleService articleService = new ArticleSystem();
		articleService.write();
		articleService.delete();
		articleService.view();
		
		//ArticleSystem is a ReplyService
		ReplyService replyService = new ArticleSystem();
		replyService.addReply();
		replyService.deleteReply();
		replyService.addReply();
			
		// MemberService, VipMemberService의 인스턴스 생성.
		// VipMemberService is a MemberService
		// member is a MemberService
		MemberService member1 = new Member();
		member1.deleteMe();
		member1.join();
		member1.logout();
		member1.login();
		
		// vipmember is a VipMemberService
		VipMemberService member2 = new VipMember();
		member2.deleteMe();
		member2.join();
		member2.login();
		member2.logout();
		member2.addPoint(10);
		
		// vipmember is a MemberService
		MemberService member3 = new VipMember();
		member3.deleteMe();
		member3.join();
		member3.login();
		member3.logout();
		if (member3 instanceof VipMemberService vip) {
			vip.addPoint(10);
		}
			
		
		// SomeInterface의 인스턴스를 생성해보기
		// Interface 는 인스턴스로 생성할 수 없다
		// => Java 의 인스턴스는 모든 메소드가 구현이 되어있어야한다.
		SomeInterface inf = new SomeClass2();
		inf.doSomething1();
		inf.doSomething2();
		inf.doSomething3();
		int value = inf.getSomething();
		System.out.println(value);
		
		String str = inf.getString();
		System.out.println(str);

	}
}
