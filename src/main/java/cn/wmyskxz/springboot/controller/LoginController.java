//package cn.wmyskxz.springboot.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpSession;
//
///**
// * @className: LoginController
// * @description: 登录控制器
// * @date: 2020/6/16
// * @author: cakin
// */
//@Controller
//public class LoginController {
//    /**
//     * 功能描述：用户登录
//     *
//     * @param userName 用户名
//     * @param password 密码
//     * @param session  session
//     * @return String 登录页
//     * @author cakin
//     * @date 2020/6/16
//     */
//    @RequestMapping("/doLogin")
//    public String login( String userName, String password, HttpSession session ) {
//        if (userName==null){
//            return"no_login";
//        }else if (userName.equals("admin") && password.equals("123456")) {
//            session.setAttribute("username", userName);
//            //登录成功返回index 否则返回登录
//            return "index";
//        }
//        return "login";
//    }
//
//    /**
//     * 功能描述：显示登录页
//     *
//     * @author cakin
//     * @date 2020/6/16
//     * @return String 登录页
//     */
//    @GetMapping("/login")
//    public String loginView() {
//        return "login";
//    }
//
//    /**
//     * 功能描述：显示非法登录页
//     *
//     * @author cakin
//     * @date 2020/6/16
//     * @return String 非法页面
//     */
//    @RequestMapping("/no_login")
//    public String noLogin() {
//        return "no_login";
//    }
//
//    /**
//     * 功能描述：显示订单页
//     *
//     * @author cakin
//     * @date 2020/6/16
//     * @return String 订单页
//     */
//    @GetMapping("/orders")
//    public String orders() {
//        return "orders";
//    }
//
//    /**
//     * 功能描述：显示用户页
//     *
//     * @author cakin
//     * @date 2020/6/16
//     * @return String 用户页
//     */
//    @GetMapping("/user")
//    public String user() {
//        return "user";
//    }
//}
