package com.uestc.fullgradecurriculum.entity;

import java.math.BigInteger;

/**
 * @author Amaris
 */
public class FreeTime {

    private BigInteger freeTimeId;
    private Integer day;
    private Integer week;
    private String section;

    public FreeTime() {
    }

    public FreeTime(BigInteger freeTimeId, Integer day, Integer week, String section) {
        this.freeTimeId = freeTimeId;
        this.day = day;
        this.week = week;
        this.section = section;
    }

    @Override
    public String toString() {
        return "FreeTime{" +
                "freeTimeId=" + freeTimeId +
                ", day=" + day +
                ", week=" + week +
                ", section='" + section + '\'' +
                '}';
    }

    public BigInteger getFreeTimeId() {
        return freeTimeId;
    }

    public void setFreeTimeId(BigInteger freeTimeId) {
        this.freeTimeId = freeTimeId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
