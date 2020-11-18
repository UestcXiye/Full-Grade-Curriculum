package com.uestc.fullgradecurriculum.controller;

import com.uestc.fullgradecurriculum.entity.Course;
import com.uestc.fullgradecurriculum.service.TimeTableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/course")
public class TimeTableController {

    Logger logger  = LoggerFactory.getLogger(getClass());
    @Autowired
    private TimeTableService timeTableService;

    @RequestMapping("/getTimeTable")
    public String[][][][] getAll(String studentNumber, String password, HttpServletResponse response){
        logger.info("学号为"+studentNumber+"的学生查询了课表信息");
        return timeTableService.GetTimeTable(studentNumber,password);
    }

}
