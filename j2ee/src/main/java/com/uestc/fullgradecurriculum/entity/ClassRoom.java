package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

/**
 * @author Amaris
 */
public class ClassRoom {

    private BigInteger classRoomId;
    private String room;
    private String type;
    private Integer seat;
    private String build;

    public ClassRoom() {
    }

    public ClassRoom(BigInteger classRoomId, String room, String type, Integer seat, String build) {
        this.classRoomId = classRoomId;
        this.room = room;
        this.type = type;
        this.seat = seat;
        this.build = build;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomId=" + classRoomId +
                ", room='" + room + '\'' +
                ", type='" + type + '\'' +
                ", seat=" + seat +
                ", build='" + build + '\'' +
                '}';
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public BigInteger getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(BigInteger classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }
}
