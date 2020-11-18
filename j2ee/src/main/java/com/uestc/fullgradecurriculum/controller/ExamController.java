package com.uestc.fullgradecurriculum.controller;

import com.uestc.fullgradecurriculum.entity.Exam;
import com.uestc.fullgradecurriculum.service.ExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Amaris
 */
@RestController
@RequestMapping("/exam")
public class ExamController {

    Logger logger  = LoggerFactory.getLogger(getClass());

    @Autowired
    private ExamService examService;

    /**
     * 根据学号和信息门户密码查询考试信息
     * @param studentNumber
     * @param password
     * @param response
     * @return
     */
    @GetMapping("/getExam")
    public List<Exam> getExam(String studentNumber, String password, HttpServletResponse response){
        List<Exam> exams = examService.getExams(studentNumber,password);
        if(exams==null){
            response.setStatus(400);
            logger.info("学号为"+studentNumber+"的学生查询考试信息中，学号或密码错误");
        }else{
            logger.info("学号为"+studentNumber+"的学生查询了一次考试信息");
        }
        return exams;
    }
}
