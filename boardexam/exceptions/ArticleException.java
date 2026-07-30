package com.ktdsuniversity.edu.oop.exam.boardexam.exceptions;

public class ArticleException extends RuntimeException {

	/**
	 * 게시글 제목을 입력하지 않았거나, 길이가 초과 할때 발생하는 예외입니다.
	 */
	private static final long serialVersionUID = 5801752971992873705L;
	
	public ArticleException (String message) {
		super(message);
	}

}
