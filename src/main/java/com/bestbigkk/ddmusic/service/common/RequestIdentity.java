package com.bestbigkk.ddmusic.service.common;

import com.bestbigkk.ddmusic.config.KeyStore;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 开
 */
@Component
public class RequestIdentity {
    public static final String ADMIN = "ADMIN";
    public static final String GUEST = "GUEST";

    public String getRequestIdentity(HttpServletRequest request){
         return request.getSession().getAttribute(KeyStore.currentLoginUser)==null ? GUEST : ADMIN;
    }
}
