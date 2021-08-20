package com.company.bloomfilter.service;

import com.company.bloomfilter.repo.dao.po.User;
import com.company.bloomfilter.repo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * todo
 *
 * @author 阮威敏
 * @since 2021.08.19
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
