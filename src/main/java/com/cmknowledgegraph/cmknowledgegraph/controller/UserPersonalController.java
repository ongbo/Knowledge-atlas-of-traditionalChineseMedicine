package com.cmknowledgegraph.cmknowledgegraph.controller;

import com.cmknowledgegraph.cmknowledgegraph.database.User;
import com.cmknowledgegraph.cmknowledgegraph.repository.UserRepository;
import com.cmknowledgegraph.cmknowledgegraph.server.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* 这个controller主要针对个人中心的一些功能做出响应
* 操作的也是个人用户的一些东西
* 登录
* 注册
* 设置，更改用户名这些
* 还有其他功能
* */
@Controller
@RequestMapping(value = "/person")
public class UserPersonalController {
    public static String phonenumberError = "请输入正确手机号！";
    public static String phonenumberExist = "手机号已注册";
    public static String phonenumberNotExist = "手机号不存在";
    public static String passwordError = "密码错误";
    public static String passwordLess = "密码太短了";
    public static String passwordMore = "密码太长";
    public static String usernameMore = "用户名太长了";
    public static String LoginRegisterSuccess = "success";

    //对于用户的个人信息的相关操作
    @Autowired
    private UserRepository userRepository = null;
    /*
    * 登录功能
    * 返回状态
    * 手机号不对
    * 密码不对
    * */
    @RequestMapping("/login")
    @ResponseBody
    public ReturnData isLogin(@RequestParam("phonenumber") String phonenumber, @RequestParam("password") String password){
        ReturnData returnData = new ReturnData();
        //需要根据用户名和密码进行判断
        if(phonenumber.length()!=11) {
            returnData.setMsg(phonenumberError);
            returnData.setData(phonenumberError);
        } else if(userRepository.existsById(phonenumber)) {
            User user = userRepository.findById(phonenumber).get();
            if (user.getPassword().equals(password)) {
                returnData.setMsg(LoginRegisterSuccess);
                returnData.setData(user);
            }
            else {
                returnData.setMsg(passwordError);
                returnData.setData(passwordError);
            }
        }else {
            returnData.setData(phonenumberNotExist);
            returnData.setMsg(phonenumberNotExist);
        }
        return returnData;
    }

    /*
    * 注册功能
    * 返回状态
    * 1_手机号已注册
    * 2_手机号不对
    * 3_
    *
    * */
    @PostMapping("/register")
    @ResponseBody
    public ReturnData isRegister(@RequestParam("phonenumber") String phonenumber,@RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("age") Long age, @RequestParam("sex") String sex){
        ReturnData returnData = new ReturnData();
        //先检查手机号
        if(phonenumber.length()!=11) {
            returnData.setMsg(phonenumberError);
            returnData.setData(phonenumberError);
        } else if(userRepository.existsById(phonenumber)) {
           returnData.setMsg(phonenumberExist);
           returnData.setData(phonenumberExist);
        } else
        //检查用户名
        if(username.length()>20) {
            returnData.setMsg(usernameMore);
            returnData.setData(usernameMore);
        }else
        //检查密码
        if(password.length()<6) {
            returnData.setData(passwordLess);
            returnData.setMsg(passwordLess);
        }else
        if(password.length()>18) {
            returnData.setData(passwordMore);
            returnData.setMsg(passwordMore);
        }else {
            /*
          !!!!!!!!!!!!!!!!!!!
                * 验证码功能!!!!!!!!!!!!!!!!!
               * !!!!!!!!!!!!!!1
              * */
            User user = new User();
            user.setPhonenumber(phonenumber);
            user.setPassword(password);
            user.setUsername(username);
            user.setAge(age);
            user.setSex(sex);
            
            userRepository.save(user);

            returnData.setMsg(LoginRegisterSuccess);
            returnData.setData(LoginRegisterSuccess);
        }
        return returnData;

    }
}
