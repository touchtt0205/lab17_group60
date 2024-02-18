package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    @Getter
    static private int countOnline = 0;
    private int previousOnline;
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    public static void Count(int i){
        countOnline += i;
    }
    public static void addCount(){
            countOnline += 1;
    }
    public static void deleteCount(){
        countOnline -= 1;
    }
    public void previousOnlineCount(){previousOnline = countOnline;}
}
