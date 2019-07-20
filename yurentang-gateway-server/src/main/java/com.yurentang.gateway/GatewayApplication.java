package com.yurentang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年06月12日 19:26
 */
@SpringCloudApplication
public class GatewayApplication {
    public static void main(String [] args){
        SpringApplication.run(GatewayApplication.class,args);
    }
}
