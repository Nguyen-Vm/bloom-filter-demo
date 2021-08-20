package com.company.bloomfilter.repo.cache;

import com.company.bloomfilter.repo.dao.po.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * todo
 *
 * @author 阮威敏
 * @since 2021.08.19
 */
@Component
public class UserCacheAccessObj {

    @Resource
    private RedisTemplate<String, User> redisTemplate;

    public User get(Long userId) {
        User user = redisTemplate.opsForValue().get(String.format("USER:%s", userId));
        return user;
    }

    public void add(Long userId, User userFromDb) {
        redisTemplate.opsForValue().set(String.format("USER:%s", userId), userFromDb, 1, TimeUnit.MINUTES);
    }
}
