package com.ktdsuniversity.edu.oop.exam.broadcastexam;

import java.time.LocalTime;

/**
 * 프로그램 실행 및 테스트 클래스
 */
public class Main {
    public static void main(String[] args) {
       
        BroadcastingService service = new BroadcastingService();

       
        Channel sbs = new Channel("SBS");
        sbs.addProgram(new Program("좋은아침", "08:30", "10:00"));
        sbs.addProgram(new Program("SBS 8시 뉴스", "20:00", "21:00"));
        service.addChannel(sbs);

        
        Channel kbs1 = new Channel("KBS 1");
        kbs1.addProgram(new Program("아침마당", "08:25", "09:30"));
        kbs1.addProgram(new Program("6시 내고향", "18:00", "19:00"));
        service.addChannel(kbs1);

       
        Channel kbs2 = new Channel("KBS 2");
        kbs2.addProgram(new Program("생생정보", "08:00", "09:10"));
        kbs2.addProgram(new Program("뮤직뱅크", "17:00", "18:30"));
        service.addChannel(kbs2);

        
        Channel mbc = new Channel("MBC");
        mbc.addProgram(new Program("드라마", "08:50", "09:45"));
        mbc.addProgram(new Program("뉴스데스크", "19:40", "20:50"));
        service.addChannel(mbc);

       
        Channel ebs = new Channel("EBS");
        ebs.addProgram(new Program("애니메이션", "08:40", "09:20"));
        ebs.addProgram(new Program("딩동댕 유치원", "09:30", "10:00"));
        service.addChannel(ebs);

        
        Channel tvn = new Channel("TVN");
        tvn.addProgram(new Program("예능", "12:00", "14:00"));
        tvn.addProgram(new Program("주말드라마", "21:10", "22:40"));
        service.addChannel(tvn);

        
        LocalTime testTime = LocalTime.of(9, 0);
        service.printAllChannelsOnAir(testTime);

        System.out.println("----------------------------------------");

        
        LocalTime currentTime = LocalTime.now();
        System.out.println("[현재 실시간 방영 조회]");
        service.printAllChannelsOnAir(currentTime);
    }
}