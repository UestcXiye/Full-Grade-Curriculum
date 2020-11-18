package com.uestc.fullgradecurriculum.service.impl;

import com.uestc.fullgradecurriculum.entity.Course;
import com.uestc.fullgradecurriculum.entity.CourseSelection;
import com.uestc.fullgradecurriculum.entity.Student;
import com.uestc.fullgradecurriculum.mapper.CourseMapper;
import com.uestc.fullgradecurriculum.mapper.CourseSelectionMapper;
import com.uestc.fullgradecurriculum.mapper.StudentMapper;
import com.uestc.fullgradecurriculum.service.TimeTableService;
import com.uestc.fullgradecurriculum.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseSelectionMapper courseSelectionMapper;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public String[][][][] GetTimeTable(String StudentNumber,String password){
        String []Weeks={"周一","周二","周三","周四","周五","周六","周日"};
        Student student=studentMapper.getStudnetByStudentNumber(StudentNumber);
        String passwordEncoded = MD5Util.getMD5(password);
        if(student.getPassword().equals(passwordEncoded)==false){ return null; }
        List<CourseSelection> courseSelection=courseSelectionMapper.selectCourseSelection(student.getStudentId());
        List<Course> course=courseMapper.readAll();
        List<Course> courseSelectionByCourseID=new ArrayList(){};
        String [][][][]TimeTableList=new String[1][6][8][7];
        for(int i=0;i<courseSelection.size();i++){
            for(int j=0;j<course.size();j++){
                if(courseSelection.get(i).getCourseID()==course.get(j).getCourseID()){
                    courseSelectionByCourseID.add(course.get(j));
                    break;
                }
            }
        }

        for(int i=0,j,k,Section;i<courseSelectionByCourseID.size();i++){
            String []sections=courseSelectionByCourseID.get(i).getSection().split(",");
            String []weeks=courseSelectionByCourseID.get(i).getWeek().split(",");
            for(j=0;j<sections.length;j++){
                for(k=0;k<Weeks.length;k++){
                    if(weeks[j].equals(Weeks[k])){
                        break;
                    }
                }
                Section=(Integer.valueOf(sections[j].substring(0,1))-1)/2;
                TimeTableList[0][Section][0][k]=courseSelectionByCourseID.get(i).getName();
                TimeTableList[0][Section][1][k]="("+sections[j]+")"+courseSelectionByCourseID.get(i).getDuration();
                TimeTableList[0][Section][2][k]=courseSelectionByCourseID.get(i).getTeacher();
                TimeTableList[0][Section][3][k]=courseSelectionByCourseID.get(i).getPlace();
            }
        }

        return TimeTableList;
    }
}
