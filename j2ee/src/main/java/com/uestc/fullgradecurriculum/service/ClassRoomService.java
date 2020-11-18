package com.uestc.fullgradecurriculum.service;

import com.uestc.fullgradecurriculum.entity.ClassRoom;
import com.uestc.fullgradecurriculum.entity.FreeTime;

import java.util.List;

public interface ClassRoomService {

    /**
     * 根据 楼区以及空闲时间信息查询所有空闲教室
     * @param build
     * @param freeTime
     * @return
     */
    List<ClassRoom> getAllClassRoomByBuildAndFreeTime(String build,FreeTime freeTime);
}
