package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {

    @Select("select student_id,password from student where student_number = #{studentNumber}")
    Student getStudnetByStudentNumber(String studentNumber);

}
