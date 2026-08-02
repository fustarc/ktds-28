package com.ktdsuniversity.edu.oop.exam.boardexam.inf;

/**
 * 댓글 관리 인터페이스
 */
public interface CommentService {

    /**
     * 1. 지정한 게시글에 댓글을 등록합니다.
     * 게시글 하나당 최대 10개의 댓글만 등록할 수 있습니다.
     *
     * @param articleId 댓글을 등록할 게시글 번호
     * @param content 댓글 내용
     * @param writer 댓글 작성자
     * @param regDate 댓글 작성 날짜
     */
    void createComment(int articleId, String content, String writer, String regDate);

    /**
     * 2. 지정한 게시글의 댓글을 삭제합니다.
     *
     * @param articleId 댓글이 등록된 게시글 번호
     * @param commentId 삭제할 댓글 번호
     */
    void deleteComment(int articleId, int commentId);

    /**
     * 3. 지정한 게시글의 댓글을 추천합니다.
     *
     * @param articleId 댓글이 등록된 게시글 번호
     * @param commentId 추천할 댓글 번호
     */
    void recommendComment(int articleId, int commentId);

    /**
     * 4. 지정한 게시글에 등록된 모든 댓글을 삭제합니다.
     *
     * @param articleId 댓글을 모두 삭제할 게시글 번호
     */
    void deleteAllComments(int articleId);
}
