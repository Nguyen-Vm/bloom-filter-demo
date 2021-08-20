package com.company.bloomfilter.service;

import com.company.bloomfilter.repo.dao.po.User;

/**
 * todo
 *
 * @author 阮威敏
 * @since 2021.08.19
 */
public interface UserService {

    User getUserById(Long userId);
}
