package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.CourseSelection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface CourseSelectionMapper {
    @Select("select * from course_selection where student_id=#{StudentID}")
    List<CourseSelection> selectCourseSelection(BigInteger StudentID);
}
