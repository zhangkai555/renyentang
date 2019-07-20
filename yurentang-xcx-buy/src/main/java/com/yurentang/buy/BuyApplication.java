package com.yurentang.buy;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年06月12日 14:37
 */
@SpringCloudApplication
@EnableFeignClients
public class BuyApplication {
    public static void main(String [] args){
        SpringApplication.run(BuyApplication.class,args);
    }
}
