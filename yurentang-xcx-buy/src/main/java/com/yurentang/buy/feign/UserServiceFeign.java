package com.yurentang.buy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO
 *
 * @author zhangkai
 * @date 2019年07月20日 22:22
 */
@FeignClient(value = "yurentang-user-server")
public interface UserServiceFeign {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String user();
}
