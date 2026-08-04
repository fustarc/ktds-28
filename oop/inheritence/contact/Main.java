package com.ktdsuniversity.edu.oop.inheritence.contact;

public class Main {
	public static void main(String[] args) {
		Contact contact = new Contact("친구1","010-1234-5678");
		String name = contact.getName();
		String phone = contact.getPhone();
		
		System.out.println(name);
		System.out.println(phone);
		
		contact.printContact();
		
		EmailContact contact2 = new EmailContact("친구2","010-1111-2222","test@email.com");
		
		name = contact2.getName();
		phone = contact2.getPhone();
		String email = contact2.getEmail();
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		
		contact2.printContact();
		
		
		
	}
}
