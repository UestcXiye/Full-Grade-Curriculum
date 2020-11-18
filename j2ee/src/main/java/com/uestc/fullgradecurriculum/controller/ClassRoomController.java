package com.uestc.fullgradecurriculum.controller;

import com.uestc.fullgradecurriculum.entity.ClassRoom;
import com.uestc.fullgradecurriculum.entity.FreeTime;
import com.uestc.fullgradecurriculum.service.ClassRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Amaris
 */
@RestController
@RequestMapping("/classRoom")
public class ClassRoomController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ClassRoomService classRoomService;

    /**
     * 获得空闲教室信息
     * @param build
     * @param freeTime
     * @return
     */
    @GetMapping("/getFreeClassRoom")
    public List<ClassRoom> getFreeClassRooms(String build, FreeTime freeTime){
        logger.info("发生一次空闲教室查询：build="+build+"; day="+freeTime.getDay()+"; week="+freeTime.getWeek()+"; section="+freeTime.getSection());
        return classRoomService.getAllClassRoomByBuildAndFreeTime(build,freeTime);
    }

}
