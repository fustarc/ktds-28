package com.ktdsuniversity.edu.oop.exam.boardexam.exceptions;

public class ArticleWriterException extends RuntimeException {

	/**
	 * 게시글 작성자의 이름이 입력되지 않았을 때 발생하는 예외입니다.
	 */
	private static final long serialVersionUID = -6096248616964014409L;
	
	public ArticleWriterException(String message) {
		super(message);
	}

}
