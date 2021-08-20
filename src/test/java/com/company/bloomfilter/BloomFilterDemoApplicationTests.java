package com.company.bloomfilter;

import com.company.bloomfilter.repo.dao.po.User;
import com.company.bloomfilter.repo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class BloomFilterDemoApplicationTests {

    @Resource
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        /*User user = new User();
        user.setId(1L);
        user.setName("阮威敏");
        user.setBirthday(LocalDate.of(1995, 9, 4));
        user.setPhoneNumber("18621629072");
        user.setGraduatedSchool("江西师范大学");
        userRepository.save(user);*/


        User userInfo = userRepository.getUserById(1L);
        log.info("user: {}", userInfo);
    }

}
