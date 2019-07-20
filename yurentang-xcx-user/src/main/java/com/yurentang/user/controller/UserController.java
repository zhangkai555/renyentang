package com.yurentang.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年06月12日 14:38
 */
@RestController
@SpringBootConfiguration
public class UserController {

    @Value("${spring.datasource.username}")
    private String userName;

    @RequestMapping("user")
    String user(){
        return userName;
    }
}
