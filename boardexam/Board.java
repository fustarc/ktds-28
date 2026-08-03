package com.ktdsuniversity.edu.oop.exam.boardexam;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exam.boardexam.data.Article;
import com.ktdsuniversity.edu.oop.exam.boardexam.data.Comment;
import com.ktdsuniversity.edu.oop.exam.boardexam.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.exam.boardexam.exceptions.ArticleWriterException;
import com.ktdsuniversity.edu.oop.exam.boardexam.inf.ArticleService;
import com.ktdsuniversity.edu.oop.exam.boardexam.inf.CommentService;


public class Board implements ArticleService, CommentService {

    private List<Article> articleList;

    public Board() {
        articleList = new ArrayList<>();
    }

    @Override
    public void createArticle(String title, String writer, String regDate, String content) {

        if (title == null || title.trim().isEmpty()) {
            throw new ArticleException("게시글 제목은 필수 입력입니다.");
        }

        if (title.trim().length() > 30) {
            throw new ArticleException("게시글 제목은 30자를 초과할 수 없습니다.");
        }

        if (writer == null || writer.trim().isEmpty()) {
            throw new ArticleWriterException("작성자는 필수 입력입니다.");
        }

        int articleId = articleList.size();

        Article article = new Article(articleId, title, writer, regDate, 0, content);

        this.articleList.add(article);

        System.out.println("게시글 작성이 완료되었습니다.");
    }

    @Override
    public void printAllArticles() {
        if (this.articleList.size() <= 0) {
            System.out.println("아직 등록된 게시글이 없습니다.");
            return;
        }

        for (int i = 0; i < this.articleList.size(); i++) {
            Article article = this.articleList.get(i);
            System.out.println(article.getArticleId() + ". "
                    + article.getTitle() + " ("
                    + article.getCommentList().size() + ")");
        }
    }

    @Override
    public void printArticleByNumber(int articleId) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        Article article = this.articleList.get(articleId);

        article.setViewCount(article.getViewCount() + 1);

        System.out.println("번호 : " + article.getArticleId());
        System.out.println("제목 : " + article.getTitle());
        System.out.println("작성자 : " + article.getWriter());
        System.out.println("작성일 : " + article.getRegDate());
        System.out.println("조회수 : " + article.getViewCount());
        System.out.println("내용 : " + article.getContent());

        if (article.getCommentList().size() <= 0) {
            System.out.println("등록된 댓글이 없습니다.");
            return;
        }

        for (int i = 0; i < article.getCommentList().size(); i++) {
            Comment c = article.getCommentList().get(i);
            System.out.println("--------------------------------");
            System.out.println("댓글번호 : " + c.getCommentId());
            System.out.println("작성자 : " + c.getWriter());
            System.out.println("작성일 : " + c.getRegDate());
            System.out.println("추천수 : " + c.getRecommendCount());
            System.out.println("내용 : " + c.getContent());
        }
    }

    @Override
    public void updateArticle(int articleId, String newTitle, String newContent) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }
        
        if (newTitle == null || newTitle.trim().isEmpty()) {
            throw new ArticleException("게시글 제목은 필수 입력입니다.");
        }

        if (newTitle.trim().length() > 30) {
            throw new ArticleException("게시글 제목은 30자를 초과할 수 없습니다.");
        }

        Article article = this.articleList.get(articleId);
        article.setTitle(newTitle);
        article.setContent(newContent);

        System.out.println("게시글이 수정되었습니다.");
    }

    @Override
    public void deleteArticle(int articleId) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        this.articleList.remove(articleId);

        for (int i = 0; i < this.articleList.size(); i++) {
        	this.articleList.get(i).setArticleId(i);
        }

        System.out.println("게시글이 삭제되었습니다.");
    }

    @Override
    public void printArticleCount() {
        if (this.articleList.size() <= 0) {
            System.out.println("등록된 게시글이 없습니다.");
            return;
        }

        System.out.println(this.articleList.size() + "개의 게시글이 등록되었습니다.");
    }

    @Override
    public void searchArticlesByTitle(String keyword) {
        boolean found = false;

        for (int i = 0; i < this.articleList.size(); i++) {
            Article article = this.articleList.get(i);

            if (article.getTitle().contains(keyword)) {
                found = true;
                System.out.println(article.getArticleId() + ". " + article.getTitle());
            }
        }

        if (!found) {
            System.out.println("검색된 게시글이 없습니다.");
        }
    }

    @Override
    public void deleteAllArticles() {
        if (this.articleList.isEmpty()) {
            System.out.println("제거할 게시글이 없습니다.");
            return;
        }

        int count = this.articleList.size();
        this.articleList.clear();

        System.out.println(count + "개의 게시글을 삭제했습니다.");
    }

    @Override
    public void createComment(int articleId, String content, String writer, String regDate) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        Article article = this.articleList.get(articleId);

        if (article.getCommentList().size() >= 10) {
            System.out.println("댓글을 더 이상 등록할 수 없습니다.");
            return;
        }

        int commentId = article.getCommentList().size();

        Comment comment = new Comment(commentId, content, writer, regDate, 0);

        article.getCommentList().add(comment);

        System.out.println("댓글이 등록되었습니다.");
    }

    @Override
    public void deleteComment(int articleId, int commentId) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        Article article = this.articleList.get(articleId);

        if (commentId < 0 || commentId >= article.getCommentList().size()) {
            System.out.println("잘못된 댓글 번호입니다.");
            return;
        }

        article.getCommentList().remove(commentId);

        for (int i = 0; i < article.getCommentList().size(); i++) {
            article.getCommentList().get(i).setCommentId(i);
        }

        System.out.println("댓글이 삭제되었습니다.");
    }

    @Override
    public void recommendComment(int articleId, int commentId) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        Article article = this.articleList.get(articleId);

        if (commentId < 0 || commentId >= article.getCommentList().size()) {
            System.out.println("잘못된 댓글 번호입니다.");
            return;
        }

        Comment comment = article.getCommentList().get(commentId);
        comment.setRecommendCount(comment.getRecommendCount() + 1);

        System.out.println("추천되었습니다.");
    }

    @Override
    public void deleteAllComments(int articleId) {
        if (articleId < 0 || articleId >= this.articleList.size()) {
            System.out.println("잘못된 게시글 번호입니다.");
            return;
        }

        Article article = this.articleList.get(articleId);

        if (article.getCommentList().size() <= 0) {
            System.out.println("등록된 댓글이 없습니다.");
            return;
        }

        int count = article.getCommentList().size();
        article.getCommentList().clear();

        System.out.println(count + "개의 댓글을 삭제했습니다.");
    }
}
