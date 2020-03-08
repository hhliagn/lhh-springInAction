package com.spring_security_jwt.demo.repository;

import com.spring_security_jwt.demo.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
