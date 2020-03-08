package com.spring_security_jwt.demo.service;

import com.spring_security_jwt.demo.model.entity.User;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface AuthService {

    User register(User userToAdd);
    String login(String username, String password);
}
