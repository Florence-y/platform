package com.innovation.platform.controller;


import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.innovation.platform.constants.UserConstants;
import com.innovation.platform.dto.UserDto;
import com.innovation.platform.po.User;
import com.innovation.platform.reply.ResponseStat;
import com.innovation.platform.reply.ResponseStatHelper;
import com.innovation.platform.service.IUserService;
import com.innovation.platform.utils.BaseCopyUtils;
import com.innovation.platform.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Florence
 * @since 2021-11-07
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json")
    ResponseStat<Map<String,Object>> login(@RequestBody UserDto userDto){
        try {
            Map<String,Object> data = new HashMap<>(5);
            QueryWrapper<User> query = new QueryWrapper<User>().eq("openid", userDto.getOpenid());
            User user = userService.getOne(query);
            if (user==null){
                Map<String,Object> param = new HashMap<>(10);
                data.put("first",true);
                //请求数据
                HttpResponse resp = HttpRequest
                        .post(UserConstants.URL.message)
                        .form(param)
                        .timeout(20000)
                        .execute();
                String userInf = resp.body();
                JsonUtil.addPropertiesToExistedObjByJsonStr(userDto,userInf) ;
                userService.save(dtoConvert(userDto));
            }
            else {
                data.put("first",false);
            }
            return ResponseStatHelper.success("登录成功",data);
        } catch (Exception e) {
            log.error("{}:登录异常",userDto.getOpenid(),e);
            return ResponseStatHelper.error("登录失败");
        }
    }


    private User dtoConvert(UserDto userDto) {
        User user = new User();
        BaseCopyUtils.copy(userDto,user);
        return user;
    }
}
