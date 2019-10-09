package com.bestbigkk.ddmusic.controller;

import com.alibaba.fastjson.JSON;
import com.bestbigkk.ddmusic.entity.LoginUser;
import com.bestbigkk.ddmusic.entity.ModifyUser;
import com.bestbigkk.ddmusic.service.AccountService;
import com.bestbigkk.ddmusic.utils.SpringContextUtil;
import com.bestbigkk.ddmusic.vo.PageNotice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 开
 * 后台管理，提供针对账户操作的接口
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    private final AccountService accountService;
    private final SpringContextUtil springContextUtil;

    @Autowired
    public AccountController(AccountService accountService, SpringContextUtil springContextUtil) {
        this.accountService = accountService;
        this.springContextUtil = springContextUtil;
    }

    @ResponseBody
    @GetMapping(value = "/verifyImage")
    public void imageVerify(HttpServletRequest request, HttpServletResponse response){
        accountService.createImageVerify(request, response);
    }

    @ResponseBody
    @RequestMapping(value = "/phoneVerifyCode", method = RequestMethod.GET)
    public JSON getPhoneVerifyCode(HttpServletRequest request, HttpServletResponse response){
        return accountService.getPhoneVerifyCode(request, response);
    }

    @ResponseBody
    @GetMapping(value = "/login")
    public JSON login(LoginUser user, HttpServletRequest request, HttpServletResponse response){
        return accountService.login(user, request, response);
    }

    @PostMapping(value="/modify")
    public String modifyAccount(ModifyUser modifyUser, HttpServletRequest request, HttpServletResponse response){
        PageNotice pageNotice = springContextUtil.getApplicationContext().getBean("pageNotice", PageNotice.class);
        HttpSession session = request.getSession();
        pageNotice.setStatus(true);

        String result =  accountService.modifyAccountInfo(modifyUser, request, response);
        if (result == null) {
            pageNotice.setLevel(PageNotice.SUCCESS);
            pageNotice.setMsg("修改账户密码成功，下次登录时需要使用新密码");
            session.setAttribute("pageNotice", pageNotice);
            return "redirect:/manage/account";
        }

        pageNotice.setMsg(result);
        pageNotice.setLevel(PageNotice.ERROR);
        session.setAttribute("pageNotice", pageNotice);
        return "redirect:/manage/account";
    }

    @GetMapping(value="/logout")
    public String logOut(HttpServletRequest request, HttpServletResponse response){
        accountService.logout(request, response);
        return "redirect:/";
    }
}
