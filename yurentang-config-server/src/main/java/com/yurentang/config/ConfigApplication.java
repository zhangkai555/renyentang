package com.yurentang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心启动类
 *
 * @author zhangkai
 * @date 2019年06月12日 17:42
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String [] args){
        SpringApplication.run(ConfigApplication.class,args);
    }
}
