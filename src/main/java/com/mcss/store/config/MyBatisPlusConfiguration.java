package com.mcss.store.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author Arron
 * @Date 2020/5/14 16:46
 * @Version 1.0
 * @Description:
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.mcss.store.sys.mapper*")
public class MyBatisPlusConfiguration {
    @Bean
    public ISqlInjector sqlInjector() {

        return new LogicSqlInjector();
    }

}
