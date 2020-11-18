package com.uestc.fullgradecurriculum.utils;

import org.springframework.util.DigestUtils;

public class MD5Util {

    private static final String salt = "&^%$#&*&%$";

    public static String getMD5(String password){
        String base = password+"/"+salt;
        String passwordEncoded = DigestUtils.md5DigestAsHex(base.getBytes());
        return passwordEncoded;
    }

}
