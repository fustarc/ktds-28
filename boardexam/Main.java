package com.ktdsuniversity.edu.oop.exam.boardexam;

import java.util.Scanner;
import com.ktdsuniversity.edu.oop.exam.boardexam.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.exam.boardexam.exceptions.ArticleWriterException;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Board board = new Board();

        int menu = -1;

        while (menu != 0) {

            System.out.println("========== 게시판 ==========");
            System.out.println("1. 게시글 작성");
            System.out.println("2. 게시글 목록");
            System.out.println("3. 게시글 조회");
            System.out.println("4. 게시글 수정");
            System.out.println("5. 게시글 삭제");
            System.out.println("6. 게시글 개수");
            System.out.println("7. 댓글 작성");
            System.out.println("8. 댓글 삭제");
            System.out.println("9. 댓글 추천");
            System.out.println("10. 제목 검색");
            System.out.println("11. 게시글 전체 삭제");
            System.out.println("12. 댓글 전체 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            try { 
            	menu = Integer.parseInt(keyboard.nextLine());
            }
            catch (NumberFormatException e) {
            	System.out.println("메뉴는 숫자만 입력해주세요");
            	continue;
            }

            switch(menu) {

            case 1:
                try {
                    System.out.print("제목 : ");
                    String title = keyboard.nextLine();

                    System.out.print("작성자 : ");
                    String writer = keyboard.nextLine();

                    System.out.print("작성일 : ");
                    String date = keyboard.nextLine();

                    System.out.print("내용 : ");
                    String content = keyboard.nextLine();

                    board.createArticle(title, writer, date, content);
                }
                catch (ArticleException | ArticleWriterException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                board.printAllArticles();
                break;

            case 3:
                System.out.print("게시글 번호 : ");
                board.printArticleByNumber(Integer.parseInt(keyboard.nextLine()));
                break;

            case 4:
                System.out.print("게시글 번호 : ");
                int aid = Integer.parseInt(keyboard.nextLine());
                System.out.print("새 제목 : ");
                String nt = keyboard.nextLine();
                System.out.print("새 내용 : ");
                String nc = keyboard.nextLine();
                board.updateArticle(aid, nt, nc);
                break;

            case 5:
                System.out.print("게시글 번호 : ");
                board.deleteArticle(Integer.parseInt(keyboard.nextLine()));
                break;

            case 6:
                board.printArticleCount();
                break;

            case 7:
                System.out.print("게시글 번호 : ");
                int a = Integer.parseInt(keyboard.nextLine());
                System.out.print("댓글 내용 : ");
                String cc = keyboard.nextLine();
                System.out.print("작성자 : ");
                String cw = keyboard.nextLine();
                System.out.print("작성일 : ");
                String cd = keyboard.nextLine();
                board.createComment(a, cc, cw, cd);
                break;

            case 8:
                System.out.print("게시글 번호 : ");
                int da = Integer.parseInt(keyboard.nextLine());
                System.out.print("댓글 번호 : ");
                int dc = Integer.parseInt(keyboard.nextLine());
                board.deleteComment(da, dc);
                break;

            case 9:
                System.out.print("게시글 번호 : ");
                int ra = Integer.parseInt(keyboard.nextLine());
                System.out.print("댓글 번호 : ");
                int rc = Integer.parseInt(keyboard.nextLine());
                board.recommendComment(ra, rc);
                break;

            case 10:
                System.out.print("검색어 : ");
                board.searchArticlesByTitle(keyboard.nextLine());
                break;

            case 11:
                board.deleteAllArticles();
                break;

            case 12:
                System.out.print("게시글 번호 : ");
                board.deleteAllComments(Integer.parseInt(keyboard.nextLine()));
                break;

            case 0:
                System.out.println("프로그램을 종료합니다.");
                break;

            default:
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        keyboard.close();
    }
}
