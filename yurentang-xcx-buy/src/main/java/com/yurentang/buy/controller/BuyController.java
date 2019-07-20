package com.yurentang.buy.controller;

import com.yurentang.buy.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年07月20日 22:15
 */
@RestController
@SpringBootConfiguration
public class BuyController {

    @Autowired
    private UserServiceFeign userService;

    @RequestMapping("buy")
    String buy(){
        return userService.user();
    }
}
