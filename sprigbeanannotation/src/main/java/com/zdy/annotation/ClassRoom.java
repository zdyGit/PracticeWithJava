package com.zdy.annotation;

public class ClassRoom {
    private int roomID;
    private String roomName;
    private Teacher tech;

    public ClassRoom(String roomName){
        this.roomName = roomName;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Teacher getTech() {
        return tech;
    }

    public void setTech(Teacher tech) {
        this.tech = tech;
    }
}
