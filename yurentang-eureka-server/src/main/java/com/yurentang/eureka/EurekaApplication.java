package com.yurentang.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年06月12日 17:42
 */
@SpringCloudApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String [] args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
