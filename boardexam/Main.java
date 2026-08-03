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


            menu = inputNumber(keyboard);
            
            while (menu != 0 ) {

            	if (menu == 1) {
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
            		catch (ArticleException e) {
            			System.out.println(e.getMessage());
            		}
            		catch (ArticleWriterException awe) {
            			System.out.println(awe.getMessage());
            		}
            		break;
            		
            	}

            	else if (menu == 2) {
            		board.printAllArticles();
            		break;
            	}
                
            	else if (menu == 3) {
            		System.out.print("게시글 번호 : ");
            		board.printArticleByNumber(inputNumber(keyboard));
            		break;
            	}
                
            	else if (menu == 4) {
            		System.out.print("게시글 번호 : ");
            		int aid = inputNumber(keyboard);
            		System.out.print("새 제목 : ");
            		String nt = keyboard.nextLine();
            		System.out.print("새 내용 : ");
            		String nc = keyboard.nextLine();
            		board.updateArticle(aid, nt, nc);
            		break;
            	}
            
            	else if (menu == 5) {
            		System.out.print("게시글 번호 : ");
            		board.deleteArticle(inputNumber(keyboard));
            		break;

            	}

            	else if (menu == 6) {
            		board.printArticleCount();
            		break;

            	}

            	else if (menu == 7) {
            		System.out.print("게시글 번호 : ");
            		int aid = inputNumber(keyboard);
            		System.out.print("댓글 내용 : ");
            		String cc = keyboard.nextLine();
            		System.out.print("작성자 : ");
            		String cw = keyboard.nextLine();
            		System.out.print("작성일 : ");
            		String cd = keyboard.nextLine();
            		board.createComment(aid, cc, cw, cd);
            		break;
            	}

            	else if (menu == 8) {
            		System.out.print("게시글 번호 : ");
            		int da = inputNumber(keyboard);
            		System.out.print("댓글 번호 : ");
            		int dc = inputNumber(keyboard);
                	board.deleteComment(da, dc);
                	break;
            	}

            	else if (menu == 9) {
            		System.out.print("게시글 번호 : ");
            		int ra = inputNumber(keyboard);
            		System.out.print("댓글 번호 : ");
            		int rc = inputNumber(keyboard);
            		board.recommendComment(ra, rc);
            		break;
            	}

            	else if (menu == 10) {
            		System.out.print("검색어 : ");
                	board.searchArticlesByTitle(keyboard.nextLine());
                	break;
            	}

            	else if (menu == 11) {
            		board.deleteAllArticles();
            		break;
            	}

            	else if (menu == 12) {
            		System.out.print("게시글 번호 : ");
            		board.deleteAllComments(inputNumber(keyboard));
            		break;
            	}

            	else if (menu == 0) {
            		System.out.println("프로그램을 종료합니다.");
            		break;
            	}

            	else {
            		System.out.println("잘못된 메뉴입니다.");
            		break;
            	}
            }
        }

        keyboard.close();
    }
    
    public static int inputNumber(Scanner keyboard) {
    	
    	while(true) {
		
    		String input = keyboard.nextLine();
    		
    		if (input.trim().isEmpty()) {
    			System.out.println("내용을 입력해주세요.");
    			continue;
    		}
    		
    		try {
    			return Integer.parseInt(input.trim());    			
    		} 
    		catch (NumberFormatException nfe) {
    			System.out.println("숫자만 입력해주세요.");
    		}
    	}
    }
}
