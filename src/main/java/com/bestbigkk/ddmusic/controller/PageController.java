package com.bestbigkk.ddmusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 开
 * 页面转发配置
 */
@Controller
@RequestMapping(value = "/")
public class PageController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String toIndexPage(){
        return "main";
    }

    @RequestMapping(value = "/about")
    public String toAbout(){ return "about"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin(){ return "index"; }

}
