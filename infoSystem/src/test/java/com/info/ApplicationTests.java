package com.info;

import com.info.dao.UserDao;
import com.info.entity.User;
import com.info.service.UserService;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

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

    @Test
    public void testRegeditOK() {
        User user = new User();
        user.setUserId("min");
        user.setPassword("min");
        user.setMail("min@gmail.com");

        val userId = user.getUserId();
        if (userId=="min"){
            System.out.println("ok");
        }else {
            System.out.println("error");
        }


    }







}
