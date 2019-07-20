package com.yurentang.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年06月12日 14:37
 */
@SpringCloudApplication
public class UserApplication {
    public static void main(String [] args){
        SpringApplication.run(UserApplication.class,args);
    }
}
