package com.yuan.mybatisplus.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName myconfig
 * @Desc TODO
 * @Author XinTai-Yuan
 * @Date 2021/7/15 17:27
 * @Version 1.0
 **/
@Configuration
@EnableTransactionManagement
public class myConfig {


//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
//        mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
//        return mybatisPlusInterceptor;
//    }

}
