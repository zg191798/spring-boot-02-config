package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangge
 * @date 2019/1/16 - 12:27
 */
// 指明当前类是一个配置类,就是来替代之前的Spring配置文件
@Configuration
public class MyAppConfig {

    // 将方法的返回值添加到容器中,容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        return  new HelloService();
    }
}
