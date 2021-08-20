package com.company.bloomfilter.repo.repository;

import com.company.bloomfilter.repo.cache.UserCacheAccessObj;
import com.company.bloomfilter.repo.dao.UserMapper;
import com.company.bloomfilter.repo.dao.po.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * todo
 *
 * @author 阮威敏
 * @since 2021.08.19
 */
@Repository
public class UserRepository {

    @Resource
    private UserCacheAccessObj userCacheAccessObj;
    @Resource
    private UserMapper userMapper;

    public User getUserById(Long userId) {
        User userCache = userCacheAccessObj.get(userId);
        if (userCache != null) {
            return userCache;
        }
        User userFromDb = getUserFromDb(userId);
        userCacheAccessObj.add(userId, userFromDb);
        return userFromDb;
    }

    public void save(User user) {
        // todo: 保存至布隆过滤器
        userMapper.insertSelective(user);
    }

    private User getUserFromDb(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
