package com.uestc.fullgradecurriculum.service.impl;

import com.uestc.fullgradecurriculum.entity.ClassRoom;
import com.uestc.fullgradecurriculum.entity.FreeTime;
import com.uestc.fullgradecurriculum.mapper.ClassRoomMapper;
import com.uestc.fullgradecurriculum.mapper.FreeTimeMapper;
import com.uestc.fullgradecurriculum.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Autowired
    private FreeTimeMapper freeTimeMapper;

    /**
     * 根据 楼区以及空闲时间信息查询所有空闲教室
     *
     * @param build
     * @param freeTime
     * @return
     */
    @Override
    public List<ClassRoom> getAllClassRoomByBuildAndFreeTime(String build, FreeTime freeTime) {
        //return classRoomMapper.getAllClassRoomByBuildAndFreeTime(build,freeTime.getDay(),freeTime.getWeek(),freeTime.getSection());

        List<FreeTime> freeTimes = freeTimeMapper.getAllFreeTimeByDayAndWeek(freeTime);
        String[] sectionsInputed = freeTime.getSection().split(",");
        List<ClassRoom> classRooms = new ArrayList<>();
        for(FreeTime f:freeTimes){
            String[] sections = f.getSection().split(",");
            List listA = Arrays.asList(sections);
            List listB = Arrays.asList(sectionsInputed);
            if(listA.containsAll(listB)){
                classRooms.addAll(classRoomMapper.getAllClassRoomByBuildAndFreeTimeId(build,f.getFreeTimeId()));
            }
        }
        return classRooms;
    }
}
