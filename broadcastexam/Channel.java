package com.ktdsuniversity.edu.oop.exam.broadcastexam;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 방송사 정보 및 해당 방송사의 프로그램 목록(Has-A)을 관리하는 클래스
 */
public class Channel {
    private final String channelName;
    private final List<Program> schedule; // Channel Has A List<Program>

    public Channel(String channelName) {
        this.channelName = channelName;
        this.schedule = new ArrayList<>();
    }

    // 편성표에 프로그램 추가
    public void addProgram(Program program) {
        this.schedule.add(program);
    }

    // 현재 시간에 방영 중인 프로그램을 찾아 반환
    public Program getCurrentProgram(LocalTime time) {
        for (Program program : schedule) {
            if (program.isOnAir(time)) {
                return program;
            }
        }
        return null; // 방영 중인 프로그램이 없음
    }

    public String getChannelName() {
        return channelName;
    }
}