package com.freeze.freeze;

public class SoundEvent {
    private String type; // "speech" 또는 "noise"
    private String content; // 음성 내용 또는 소리 종류 (예: "문 열어줘" or "개 짖는 소리")
    private String direction; // 방향 정보 (예: "left", "right", "front") — speech면 null

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", content=" + content + ", direction=" + direction + "]";
    }
}
