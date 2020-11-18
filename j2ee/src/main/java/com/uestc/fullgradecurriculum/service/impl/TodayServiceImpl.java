package com.uestc.fullgradecurriculum.service.impl;

import com.uestc.fullgradecurriculum.entity.Today;
import com.uestc.fullgradecurriculum.mapper.TodayMapper;
import com.uestc.fullgradecurriculum.service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodayServiceImpl implements TodayService {

    @Autowired
    private TodayMapper todayMapper;

    /**
     * 获得相应类型起始日期
     *
     * @param today
     * @return
     */
    @Override
    public Today getToday(Today today) {
        return todayMapper.getTodayByName(today.getName());
    }
}
