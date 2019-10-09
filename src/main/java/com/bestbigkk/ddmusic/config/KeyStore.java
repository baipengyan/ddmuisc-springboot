package com.bestbigkk.ddmusic.config;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author 开
 * 代码中依旧存在大量魔法值，可以考虑将其全部抽离出来到一个类甚至是一个独立的配置文件中去。此处仅仅列出一小部分。
 */
@Component
public final class KeyStore implements Serializable {
    public static final  String imageVerifyCode = "图形验证码结果";
    public static final String lastRequestTime= "上次请求发送短信验证码时间";
    public static final String phoneCode = "发送到手机的验证码";
    public static final String currentLoginUser = "当前登录用户";

    /** JSON模式下响应的信息 */
    public static final String MSG = "msg";
    /** JSON模式下，响应状态 */
    public static final String STATUS = "status";
}
