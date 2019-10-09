package com.bestbigkk.ddmusic.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 开
 */
@Component
@Scope(value = "prototype")
public class AccountPage {
    private String account;

    @Override
    public String toString() {
        return "AccountPage{" +
                "account='" + account + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
