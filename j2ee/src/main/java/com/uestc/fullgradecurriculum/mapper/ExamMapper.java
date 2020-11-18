package com.uestc.fullgradecurriculum.mapper;

import com.uestc.fullgradecurriculum.entity.Exam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Mapper
@Repository
public interface ExamMapper {

    @Select("select exam_id,name,time,room,teacher,num from exam where exam_id in " +
            "(select exam_id from rela_student_exam where student_id = #{studentId})")
    List<Exam> getExamByStudentId(BigInteger studentId);

}