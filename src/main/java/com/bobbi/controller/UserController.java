package com.bobbi.controller;

import com.bobbi.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bobbi on 18/3/19.
 */
@Controller
public class UserController {

    @RequestMapping(value = {"", "/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/user/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/unauthor")
    public String unauthor() {
        return "unauthor";
    }

    /**
     * 跳转到登录页面
     * 在需要认证的时候进入页面
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/submitLogin")
    public String submitLogin(User user) {
        System.out.println("表单提交的参数为： " + user);

        /* 1.获得当前的Subject用户对象 */
        Subject currentUser = SecurityUtils.getSubject();

        /* 2.*/
        UsernamePasswordToken token = new UsernamePasswordToken(
                user.getUserName(), user.getPassword()
        );

        /* 3.执行shiro认证 */
        try {
            currentUser.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("认证失败返回登录页面");
            return "login";
        }
        return "home";
    }

    /**
     * 退出登录
     * */
    @RequestMapping("/logout")
    public String logout(){
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "login";
    }

}


