package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.ClassRoom;
import com.uestc.fullgradecurriculum.entity.FreeTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface ClassRoomMapper {

    @Select("select room,type,seat from class_room where build = #{build} and class_room_id in " +
            "(select class_room_id from rela_free_room where free_time_id in " +
            "(select free_time_id from free_time where day = #{day} and week = #{week} and section = #{section}))")
    List<ClassRoom> getAllClassRoomByBuildAndFreeTime(String build, Integer day,Integer week,String section);

    @Select("select room,type,seat from class_room where build = #{build} and class_room_id in " +
            "(select class_room_id from rela_free_room where free_time_id = #{freeTimeId})")
    List<ClassRoom> getAllClassRoomByBuildAndFreeTimeId(String build, BigInteger freeTimeId);


}
