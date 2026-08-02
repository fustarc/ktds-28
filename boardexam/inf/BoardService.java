package com.ktdsuniversity.edu.oop.exam.boardexam.inf;

/**
 * 게시글 관리 인터페이스
 */
public interface ArticleService {

    /**
     * 1. 게시글을 작성하고 목록에 추가합니다.
     *
     * @param title 게시글 제목 (필수 입력, 30자 이내, 공백만 입력 불가)
     * @param writer 게시글 작성자 이름 (필수 입력)
     * @param regDate 게시글 작성 날짜
     * @param content 게시글 내용
     */
    void createArticle(String title, String writer, String regDate, String content);

    /**
     * 2. 등록된 모든 게시글의 목록(번호, 제목, 댓글 수)을 출력합니다.
     * 등록된 게시글이 없으면 안내 문구를 출력합니다.
     */
    void printAllArticles();

    /**
     * 3. 지정한 게시글 번호의 상세 정보를 출력합니다.
     * 게시글 조회 시 조회수가 1 증가합니다.
     *
     * @param articleId 조회할 게시글 번호
     */
    void printArticleByNumber(int articleId);

    /**
     * 4. 지정한 게시글의 제목과 내용을 수정합니다.
     *
     * @param articleId 수정할 게시글 번호
     * @param newTitle 변경할 게시글 제목
     * @param newContent 변경할 게시글 내용
     */
    void updateArticle(int articleId, String newTitle, String newContent);

    /**
     * 5. 지정한 게시글 번호의 게시글을 삭제합니다.
     *
     * @param articleId 삭제할 게시글 번호
     */
    void deleteArticle(int articleId);

    /**
     * 6. 현재 게시판에 등록된 게시글의 개수를 출력합니다.
     */
    void printArticleCount();

    /**
     * 7. 게시글 제목에 검색어가 포함된 게시글을 검색하여 출력합니다.
     *
     * @param keyword 검색할 제목 키워드
     */
    void searchArticlesByTitle(String keyword);

    /**
     * 8. 게시판에 등록된 모든 게시글을 삭제합니다.
     */
    void deleteAllArticles();
}
