package com.innovation.platform.service.impl;

import com.innovation.platform.po.Hello;
import com.innovation.platform.mapper.HelloMapper;
import com.innovation.platform.service.IHelloService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Florence
 * @since 2022-03-12
 */
@Service
public class HelloServiceImpl extends ServiceImpl<HelloMapper, Hello> implements IHelloService {

    @Override
    public Hello hello() {
        return new Hello();
    }
}
