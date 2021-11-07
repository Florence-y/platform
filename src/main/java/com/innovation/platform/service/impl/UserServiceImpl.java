package com.innovation.platform.service.impl;

import com.innovation.platform.po.User;
import com.innovation.platform.mapper.UserMapper;
import com.innovation.platform.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Florence
 * @since 2021-11-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
