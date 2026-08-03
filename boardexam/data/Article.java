package com.ktdsuniversity.edu.oop.exam.boardexam.data;

import java.util.ArrayList;
import java.util.List;

public class Article {

    /**
     * 게시글 번호
     */
    private int articleId;

    /**
     * 게시글 제목
     */
    private String title;

    /**
     * 게시글 작성자
     */
    private String writer;

    /**
     * 게시글 작성 날짜
     */
    private String regDate;

    /**
     * 게시글 조회수
     */
    private int viewCount;

    /**
     * 게시글 내용
     */
    private String content;

    /**
     * 게시글 댓글 목록
     */
    private List<Comment> commentList;

    /**
     * 
     * @param articleId 게시글 번호
     * @param title 게시글 제목
     * @param writer 작성자
     * @param regDate 작성일자
     * @param viewCount 조회수
     * @param content 내용
     */
    public Article(int articleId, String title, String writer, String regDate, int viewCount, String content) {

        this.articleId = articleId;
        this.title = title;
        this.writer = writer;
        this.regDate = regDate;
        this.viewCount = viewCount;
        this.content = content;

        // 게시글 생성 시 댓글 목록 생성
        this.commentList = new ArrayList<Comment>();
    }

    public int getArticleId() {
        return this.articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getCommentList() {
        return this.commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

}
