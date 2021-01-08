package com.mhr.manager.controller;

import com.mhr.basic.utils.BackUtil.ApiResult;
import com.mhr.basic.utils.BackUtil.ResultUtil;
import com.mhr.entity.UserLoginEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * Description TODO
 * @Author MaHaiRui
 * @Date 2020-06-06-13:54
 * Version 1.0
 */
@RestController()
@RequestMapping("/manager/api")
public class LoginController {


    @GetMapping(value = {"","/"})
    public String hello(){
        System.out.println("Index");
        return  "index";
    }
    @RequestMapping("/error404")
    public String error(){
        System.out.println("404");
        return "404";
    }
    @RequestMapping("/login")
    public ApiResult<String> indexOne(UserLoginEntity userLoginEntity){
        System.out.println("name:"+userLoginEntity.getUserLoginName());
        System.out.println("mhr_login");
        return ResultUtil.getOKResult("SUCCESS");
    }

    @RequestMapping("/vue")
    public ApiResult<String> vue (String id){
        System.out.println("vue:"+id);
        return ResultUtil.getOKResult("SUCCESS");
    }

    @RequestMapping("/test")
    public String test (String id){
        System.out.println("test:"+id);
        return "SUCCESS";
    }
}
