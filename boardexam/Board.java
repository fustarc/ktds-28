package com.ktdsuniversity.edu.oop.exam.boardexam;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exam.boardexam.data.Article;
import com.ktdsuniversity.edu.oop.exam.boardexam.data.Comment;


public class Board implements ArticleService, CommentService {

    /**
     * 게시글 목록
     */
    private List<Article> articleList;

    /**
     * 게시판 생성자
     */
    public Board() {
        articleList = new ArrayList<>();
    }

    @Override
    public void createArticle(String title, String writer, String regDate, String content) {

    }

    @Override
    public void printAllArticles() {

    }

    @Override
    public void printArticleByNumber(int articleId) {

    }

    @Override
    public void updateArticle(int articleId, String newTitle, String newContent) {

    }

    @Override
    public void deleteArticle(int articleId) {

    }

    @Override
    public void printArticleCount() {

    }

    @Override
    public void searchArticlesByTitle(String keyword) {

    }

    @Override
    public void deleteAllArticles() {

    }

    @Override
    public void createComment(int articleId, String content, String writer, String regDate) {

    }

    @Override
    public void deleteComment(int articleId, int commentId) {

    }

    @Override
    public void recommendComment(int articleId, int commentId) {

    }

    @Override
    public void deleteAllComments(int articleId) {

    }

}