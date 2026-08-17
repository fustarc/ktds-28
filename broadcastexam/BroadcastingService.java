package com.ktdsuniversity.edu.oop.exam.broadcastexam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 여러 방송사(Has-A)를 등록하고 상태를 일괄 출력하는 서비스 클래스
 */
public class BroadcastingService {
    private final List<Channel> channels; // BroadcastingService Has A List<Channel>

    public BroadcastingService() {
        this.channels = new ArrayList<>();
    }

    // 방송사 등록
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    // 등록된 모든 방송사의 온에어 현황 출력
    public void printAllChannelsOnAir(LocalTime time) {
        System.out.println("현재 시간 " + time.format(DateTimeFormatter.ofPattern("HH:mm")));
        
        for (Channel channel : channels) {
            Program currentProgram = channel.getCurrentProgram(time);
            
            if (currentProgram != null) {
                System.out.printf("%s “%s” 이(가) 방영중입니다.%n", 
                        channel.getChannelName(), currentProgram.getTitle());
            } else {
                System.out.printf("%s 방영중인 시간이 아닙니다.%n", 
                        channel.getChannelName());
            }
        }
    }
}