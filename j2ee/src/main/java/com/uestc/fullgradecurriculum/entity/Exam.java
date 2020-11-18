package com.uestc.fullgradecurriculum.entity;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.math.BigInteger;

/**
 * @author Amaris
 */
public class Exam {
    private BigInteger examId;
    private String name;
    private String time;
    private String room;
    private String teacher;
    private Integer num;

    public Exam() {
    }

    public Exam(BigInteger examId, String name, String time, String room, String teacher, Integer num) {
        this.examId = examId;
        this.name = name;
        this.time = time;
        this.room = room;
        this.teacher = teacher;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", room='" + room + '\'' +
                ", teacher='" + teacher + '\'' +
                ", num=" + num +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigInteger getExamId() {
        return examId;
    }

    public void setExamId(BigInteger examId) {
        this.examId = examId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
