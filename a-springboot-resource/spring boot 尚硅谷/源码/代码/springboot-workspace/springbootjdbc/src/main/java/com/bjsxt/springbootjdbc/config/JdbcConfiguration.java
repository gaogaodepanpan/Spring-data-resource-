package com.bjsxt.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 数据源的JDBC配置类
 */
//@Configuration
//@PropertySource("classpath:/jdbc.properties")  //加载指定的Properties配置文件
//@EnableConfigurationProperties(JdbcProperties.class)//指定加载哪个配置信息属性类
public class JdbcConfiguration {

    //@Autowired
   /* private JdbcProperties jdbcProperties;

    public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }*/

    /**
     * 实例化Druid
     */
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();
        return source;
    }
}
