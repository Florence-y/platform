package com.innovation.platform.services;

import com.innovation.platform.po.User;

/**
 * @author Florence
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int save(User user);
}
