package com.uestc.fullgradecurriculum.controller;

import com.uestc.fullgradecurriculum.entity.Today;
import com.uestc.fullgradecurriculum.service.TimeService;
import com.uestc.fullgradecurriculum.service.TodayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amaris
 */
@RestController
@RequestMapping("/time")
public class TimeController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TodayService todayService;

    @Autowired
    private TimeService timeService;

    @GetMapping("/getToday")
    public Today getToday(Today today){
        logger.info("查询的时间类型为"+today.getName());
        return todayService.getToday(today);
    }

}
