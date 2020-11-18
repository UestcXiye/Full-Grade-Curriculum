package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.Today;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TodayMapper {

    @Select("select start_time from today where name = #{name}")
    Today getTodayByName(String name);
}
