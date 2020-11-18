package com.uestc.fullgradecurriculum.service.impl;

import com.uestc.fullgradecurriculum.entity.Exam;
import com.uestc.fullgradecurriculum.entity.Student;
import com.uestc.fullgradecurriculum.mapper.ExamMapper;
import com.uestc.fullgradecurriculum.mapper.StudentMapper;
import com.uestc.fullgradecurriculum.service.ExamService;
import com.uestc.fullgradecurriculum.utils.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ExamMapper examMapper;


    /**
     * 根据学号和信息门户密码查询考试信息
     *
     * @param studentNumber
     * @param password
     * @return
     */
    @Override
    public List<Exam> getExams(String studentNumber, String password) {
        Student student = studentMapper.getStudnetByStudentNumber(studentNumber);
        if(student==null){
            return null;
        }
        String passwordEncoded = student.getPassword();
        boolean flag = MD5Util.getMD5(password).equals(passwordEncoded);
        if(flag==false) {
            return null;
        }
        return examMapper.getExamByStudentId(student.getStudentId());
    }
}
