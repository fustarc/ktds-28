package com.ktdsuniversity.edu.oop.exam.boardexam;

public interface BoardService {
	
	/** 게시글 작성 */
	void writeArticle();
	
	/** 게시글 출력 */
	void printArticle();
	
	/** 게시글 읽기 */
	void readArticle();
	
	/** 게시글 수정 */
	void updateArticle();
	
	/** 게시글 삭제 */
	void deleteArticle();
	
	/** 등록된 게시글 개수 확인 */
	void countArticle();
	
	/** 게시글 숫자로 검색하여 댓글 달기 */
	void createCommByNum();
	
	/** 댓글 삭제하기 */
	void deleteComment();
	
	/** 댓글 추천하기 */
	void recommendComment();

	/** 게시글 제목으로 찾기 */
	void searchArticleByTitle();
	
	/** 모든 게시판의 게시글 삭제하기 */
	void deleteAllArticle();
	
	/** 게시글의 모든 댓글 삭제하기 */
	void delAllCommentArticle();
}
