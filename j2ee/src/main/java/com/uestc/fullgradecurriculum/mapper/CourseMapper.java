package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    @Select("select * from course")
    List<Course> readAll();
}
