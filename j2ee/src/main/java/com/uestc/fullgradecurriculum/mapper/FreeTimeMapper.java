package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.FreeTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FreeTimeMapper {

    @Select("select free_time_id,section from free_time where day" +
            " = #{day} and week = #{week}")
    List<FreeTime> getAllFreeTimeByDayAndWeek(FreeTime freeTime);

}
