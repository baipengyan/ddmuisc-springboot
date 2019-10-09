package com.bestbigkk.ddmusic.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author 开
 * 注册Bean到容器内部，实际上SpringBoot可以直接返回JSON数据，这里依旧使用FastJSON主要是为了便于从旧项目过渡。
 */

@Configuration
public class BeanConfig {

    @Bean(name = "JSONObject")
    @Scope(value = "prototype")
    public JSONObject addJSONObject2Bean() {
        return new JSONObject();
    }
}
