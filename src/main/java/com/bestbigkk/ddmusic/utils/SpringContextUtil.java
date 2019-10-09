package com.bestbigkk.ddmusic.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 开
 * 便于后续快速获取applicationContext对象
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("成功加载Spring容器");
        SpringContextUtil.applicationContext = applicationContext;
    }
    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
