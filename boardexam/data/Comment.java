package com.ktdsuniversity.edu.oop.exam.boardexam.data;

public class Comment {

    /**
     * 댓글 번호
     */
    private int commentId;

    /**
     * 댓글 내용
     */
    private String content;

    /**
     * 댓글 작성자
     */
    private String writer;

    /**
     * 댓글 작성 날짜
     */
    private String regDate;

    /**
     * 댓글 추천 수
     */
    private int recommendCount;

    /**
     * 댓글 생성자
     */
    public Comment(int commentId, String content,
                   String writer, String regDate,
                   int recommendCount) {

        this.commentId = commentId;
        this.content = content;
        this.writer = writer;
        this.regDate = regDate;
        this.recommendCount = recommendCount;
    }

    public int getCommentId() {
        return this.commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegDate() {
        return this.regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getRecommendCount() {
        return this.recommendCount;
    }

    public void setRecommendCount(int recommendCount) {
        this.recommendCount = recommendCount;
    }

}
