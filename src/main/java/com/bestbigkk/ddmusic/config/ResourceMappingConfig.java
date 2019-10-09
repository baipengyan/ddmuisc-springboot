package com.bestbigkk.ddmusic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 开
 * 添加本地资源目录映射
 */
@Configuration
public class ResourceMappingConfig implements WebMvcConfigurer {

    @Value("${music.path.resourceRootPath}")
    private String resourceRootPath;

    @Value("${music.path.prefixMappingPath}")
    private String prefixMappingPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("本地目录映射:::::prefixMappingPath="+prefixMappingPath+", resourceRootPath="+resourceRootPath);
        registry.addResourceHandler(prefixMappingPath + "**").addResourceLocations("file:"+resourceRootPath);
    }
}
