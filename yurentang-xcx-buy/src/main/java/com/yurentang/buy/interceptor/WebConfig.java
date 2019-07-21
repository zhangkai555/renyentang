package com.yurentang.buy.interceptor;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 加载拦截器
 * 注意：些处要继承WebMvcConfigurerAdapter,否则静态资源文件无法访问
 * @author zhangkai
 * @date 2019年06月12日 17:21
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor());
    }
}