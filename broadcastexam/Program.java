package com.ktdsuniversity.edu.oop.exam.broadcastexam;

import java.time.LocalTime;

/**
 * 프로그램 정보를 저장하고, 특정 시간에 방영 중인지 판단하는 클래스
 */
public class Program {
    private final String title;
    private final LocalTime startTime;
    private final LocalTime endTime;

    public Program(String title, String startTimeStr, String endTimeStr) {
        this.title = title;
        this.startTime = LocalTime.parse(startTimeStr);
        this.endTime = LocalTime.parse(endTimeStr);
    }

    // 주어진 시간이 프로그램 시작~종료 시간 사이인지 검증
    public boolean isOnAir(LocalTime time) {
        return (!time.isBefore(startTime)) && (!time.isAfter(endTime));
    }

    public String getTitle() {
        return title;
    }
}