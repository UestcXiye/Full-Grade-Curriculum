package com.uestc.fullgradecurriculum.service;

import com.uestc.fullgradecurriculum.entity.Today;

public interface TodayService {

    /**
     * 获得相应类型起始日期
     * @param today
     * @return
     */
    Today getToday(Today today);
}
