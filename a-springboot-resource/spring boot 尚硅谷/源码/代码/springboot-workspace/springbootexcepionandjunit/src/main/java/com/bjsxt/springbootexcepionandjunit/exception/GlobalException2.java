package com.bjsxt.springbootexcepionandjunit.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 全局异常
 * SimpleMappingExceptionResolver
 */
//@Configuration
public class GlobalException2 {

   /* *//**
     * 此方法返回值必须是SimpleMappingExceptionResolver对象
     * @return
     *//*
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        *//**
         * 参数一：异常类型，并且是全名
         * 参数二：视图名称
         *//*
        properties.put("java.lang.NullPointerException","error3");
        properties.put("java.lang.ArithmeticException","error4");

        resolver.setExceptionMappings(properties);
        return resolver;
    }*/

}
