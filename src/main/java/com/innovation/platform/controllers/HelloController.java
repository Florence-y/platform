package com.innovation.platform.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.innovation.platform.dto.UserDto;
import com.innovation.platform.mappers.UserMapper;
import com.innovation.platform.po.User;
import com.innovation.platform.services.UserService;
import com.innovation.platform.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

/**
 * @author Florence
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(UserDto userDto){
        try {
            userService.save(convertDto(userDto));
            return JsonUtil.objToJson(userDto);
        } catch (JsonProcessingException e) {
            log.error("Json转化失败");
        }
        return "500";
    }


    private User convertDto(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }
}
