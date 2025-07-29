package com.freeze.freeze;

public class SoundEvent {
    private String text;
    private String direction;
    private String soundClass;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSoundClass() {
        return soundClass;
    }

    public void setSoundClass(String soundClass) {
        this.soundClass = soundClass;
    }

    @Override
    public String toString() {
        return "[text=" + text + ", direction=" + direction + ", soundClass=" + soundClass + "]";
    }
}
