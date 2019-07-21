package com.yurentang.buy.feign.hystrix;

import com.yurentang.buy.feign.service.UserServiceFeign;
import org.springframework.stereotype.Component;

/**
 * feign熔断器实现
 *
 * @author zhangkai
 * @date 2019年07月20日 22:22
 */
@Component
public class UserServiceHystrix implements UserServiceFeign{

    @Override
    public String user() {
        return "用户服务发生故障！";
    }
}
