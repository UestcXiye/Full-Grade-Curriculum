package com.uestc.fullgradecurriculum;

import com.uestc.fullgradecurriculum.mapper.ClassRoomMapper;
import com.uestc.fullgradecurriculum.mapper.FreeTimeMapper;
import com.uestc.fullgradecurriculum.service.ClassRoomService;
import com.uestc.fullgradecurriculum.service.ExamService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class FullGradeCurriculumApplicationTests {

    @Autowired
    private ExamService examService;

    @Autowired
    private FreeTimeMapper freeTimeMapper;

    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Autowired
    private ClassRoomService classRoomService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
        //BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        //System.out.println(bCryptPasswordEncoder.encode("123456"));
        //String password = "123456";
        //String passwordEncoded = "$10$MrO/pKfQfW22UGxQ96Mms.pNPei0Slvu5y9evXW5us6IJw9KStdJy";
        //System.out.println(examService.getExams("2018080901024","123456"));
        //System.out.println(passwordEncoder.matches(password.subSequence(0,5),passwordEncoded));
//        Calendar calendar = Calendar.getInstance();
//        String today = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE);
//        System.out.println(today)
//        String build = "品学楼";
//        FreeTime freeTime = new FreeTime();
//        freeTime.setDay(2);
//        freeTime.setWeek(1);
//        freeTime.setSection("1,2");
//        //System.out.println(classRoomMapper.getAllClassRoomByBuildAndFreeTime(build,freeTime.getDay(),freeTime.getWeek(),freeTime.getSection()));
//        System.out.println(classRoomService.getAllClassRoomByBuildAndFreeTime(build,freeTime));
//        System.out.println(MD5Util.getMD5("123456"));
//        System.out.println(MD5Util.getMD5("123456"));
        System.out.println(examService.getExams("2018080901024","123456"));
        System.out.println(examService.getExams("2018080901024","12456"));
    }

}
