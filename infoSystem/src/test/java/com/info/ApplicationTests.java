package com.info;

import com.info.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void findByUserId() {

        System.out.println(userService.findByUserId("admin"));

    }
    @Test
    public void checkUserId() {

        System.out.println(userService.checkUserId("admin"));

    }
    @Test
    public void loginIn() {

        System.out.println(userService.loginIn("admin","admin"));

    }
    @Test
    public void queryAllUser() {

        System.out.println(userService.queryAllUser());

    }
}
