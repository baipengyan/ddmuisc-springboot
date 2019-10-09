package com.bestbigkk.ddmusic.service.common;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author 开
 * 短信验证码服务，此处已删除。可自己实现
 */
@Component
public class SmsService {

    private final Integer SMS_NUMBER_THRESHOLD = 100;
    private Integer count = 0;

    //每天凌晨一点重置
    //@Scheduled(cron = "0 0 1 * ? ?")
    private synchronized void resetThreshold(){
        count = 0;
    }

    /*
    * 为目标手机发送验证码，
    * 方法返回发送验证码内容，当发送失败，将返回null
    * */
    public String sendSMS(String phone){
       return new Random().nextInt(1111)+8888+"";
    }
}
