package com.innovation.platform.controller;


import com.innovation.platform.po.Hello;
import com.innovation.platform.reply.ResponseStat;
import com.innovation.platform.reply.ResponseStatHelper;
import com.innovation.platform.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
@RestController
@RequestMapping("/platform/hello")
public class HelloController {

    @Autowired
    IHelloService iHelloService;



    @GetMapping("/{id}")
    public ResponseStat<Hello> hello(@PathVariable(name = "id") Long id) {
        Hello byId = iHelloService.getById(id);
        return ResponseStatHelper.success("success",byId);
    }

    @PostMapping("/save")
    public ResponseStat<Hello> save(@RequestParam(value = "name", defaultValue = "World") String name,
                             @RequestParam(value = "editUserId", defaultValue = "123213") Long editUserId,
                             @RequestParam(value = "editUserId", defaultValue = "123213") String password) {
        //ID自增不用加
        Hello hello = new Hello(name,editUserId,password);
        boolean save = iHelloService.save(hello);
        return ResponseStatHelper.success("添加成功");
    }
}
