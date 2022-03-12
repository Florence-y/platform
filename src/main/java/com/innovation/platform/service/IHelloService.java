package com.innovation.platform.service;

import com.innovation.platform.po.Hello;
import com.baomidou.mybatisplus.extension.service.IService;
import com.innovation.platform.service.impl.HelloServiceImpl;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
public interface IHelloService extends IService<Hello> {
    Hello hello();
}
