package com.ktdsuniversity.edu.oop.exam.boardexam;

public interface BoardService {
package service;

import com.ktdsuniversity.edu.oop.exam.ArticleException;
import com.ktdsuniversity.edu.oop.exam.ArticleWriterException;

/**
 * 게시판 및 댓글 인터페이스
 */
public interface BoardService {

    /**
     * 1. 게시글을 작성하고 목록에 추가합니다.
     * 
     * @param title   게시글 제목 (필수 입력, 30자 이내, 공백만 입력 불가)
     * @param writer  게시글 작성자 이름 (필수 입력)
     * @param regDate 게시글 작성 날짜
     * @param content 게시글 내용
     * @throws ArticleException       제목을 입력하지 않았거나 30자를 초과할 경우 발생
     * @throws ArticleWriterException 작성자 이름을 입력하지 않았을 경우 발생
     */
    void createArticle(String title, String writer, String regDate, String content);

    /**
     * 2. 등록된 모든 게시글의 목록(번호, 제목, 댓글 수)을 출력합니다.
     * 등록된 게시글이 없으면 안내 문구를 출력합니다.
     */
    void printAllArticles();

    /**
     * 3. 지정한 게시글 번호의 상세 정보와 해당 게시글의 모든 댓글 목록을 출력합니다.
     * 조회 시 게시글의 조회수가 1 증가합니다.
     * 
     * @param articleId 조회할 게시글 번호
     */
    void printArticleByNumber(int articleId);

    /**
     * 4. 지정한 게시글의 제목과 내용을 수정합니다.
     * 
     * @param articleId  수정할 게시글 번호
     * @param newTitle   변경할 새 제목
     * @param newContent 변경할 새 내용
     */
    void updateArticle(int articleId, String newTitle, String newContent);

    /**
     * 5. 지정한 게시글 번호의 게시글을 삭제합니다.
     * 삭제 후 남아있는 게시글들의 번호(인덱스)가 자동으로 재정렬됩니다.
     * 
     * @param articleId 삭제할 게시글 번호
     */
    void deleteArticle(int articleId);

    /**
     * 6. 현재 게시판에 등록된 총 게시글의 개수를 출력합니다.
     */
    void printArticleCount();

    /**
     * 7. 입력한 키워드가 제목에 포함되어 있는 게시글 목록을 검색하여 출력합니다.
     * 
     * @param keyword 검색할 제목 키워드
     */
    void searchArticlesByTitle(String keyword);

    /**
     * 8. 게시판에 등록된 모든 게시글을 전체 삭제합니다.
     */
    void deleteAllArticles();


   
    /**
     * 9. 지정한 게시글에 새 댓글을 추가합니다. (게시글 당 최대 10개)
     * 
     * @param articleId 댓글을 작성할 게시글 번호
     * @param content   댓글 내용
     * @param writer    댓글 작성자 이름
     * @param regDate   댓글 작성 날짜
     */
    void createComment(int articleId, String content, String writer, String regDate);

    /**
     * 10. 지정한 게시글에 등록된 특정 댓글을 삭제합니다.
     * 삭제 후 해당 게시글의 댓글 번호(인덱스)가 자동으로 재정렬됩니다.
     * 
     * @param articleId 삭제할 댓글이 속한 게시글 번호
     * @param commentId 삭제할 댓글 번호
     */
    void deleteComment(int articleId, int commentId);

    /**
     * 11. 지정한 게시글에 등록된 특정 댓글의 추천 수를 1 증가시킵니다.
     * 
     * @param articleId 추천할 댓글이 속한 게시글 번호
     * @param commentId 추천할 댓글 번호
     */
    void recommendComment(int articleId, int commentId);

    /**
     * 12. 지정한 게시글에 등록된 모든 댓글을 일괄 삭제합니다.
     * 
     * @param articleId 댓글을 전체 삭제할 게시글 번호
     */
    void deleteAllCommentsByArticle(int articleId);

   
}

