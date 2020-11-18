package com.uestc.fullgradecurriculum.service;

import com.uestc.fullgradecurriculum.entity.Exam;

import java.util.List;

public interface ExamService {

    /**
     * 根据学号和信息门户密码查询考试信息
     * @param studentNumber
     * @param password
     * @return
     */
    List<Exam> getExams(String studentNumber, String password);

}
