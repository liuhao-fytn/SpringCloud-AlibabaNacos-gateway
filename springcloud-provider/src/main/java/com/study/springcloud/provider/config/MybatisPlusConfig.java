package com.study.springcloud.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.study.springcloud.provider.mapper")
public class MybatisPlusConfig {
}
