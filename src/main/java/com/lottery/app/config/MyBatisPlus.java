package com.lottery.app.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlus {
        //分页插件
        @Bean
        public PaginationInterceptor mybatisPlusInterceptor() {
            return new PaginationInterceptor();
        }
}
