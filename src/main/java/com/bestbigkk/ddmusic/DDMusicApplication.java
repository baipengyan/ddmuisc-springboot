package com.bestbigkk.ddmusic;

import com.bestbigkk.ddmusic.service.common.FileStore;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author 开
 */
@SpringBootApplication
@MapperScan("com.bestbigkk.ddmusic.dao")
@EnableConfigurationProperties({FileStore.class})
public class DDMusicApplication {
    public static void main(String[] args) {
        SpringApplication.run(DDMusicApplication.class, args);
    }
}
