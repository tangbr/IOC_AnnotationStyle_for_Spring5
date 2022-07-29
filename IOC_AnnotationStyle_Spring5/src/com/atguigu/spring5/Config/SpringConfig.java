package com.atguigu.spring5.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages={"com.atguigu"})
public class SpringConfig {

}
