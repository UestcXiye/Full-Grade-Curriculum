package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

/**
 * @author Amaris
 */
public class Today {

    private BigInteger todayId;
    private String name;
    private String startTime;

    public Today() {
    }

    public Today(BigInteger todayId, String name, String startTime) {
        this.todayId = todayId;
        this.name = name;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Today{" +
                "todayId=" + todayId +
                ", name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }

    public BigInteger getTodayId() {
        return todayId;
    }

    public void setTodayId(BigInteger todayId) {
        this.todayId = todayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
