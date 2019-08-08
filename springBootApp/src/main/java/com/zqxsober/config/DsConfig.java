package com.zqxsober.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Component
@MapperScan(basePackages = {"com.zqxsober.dao"})
public class DsConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("rc_system_admin");
        dataSource.setUrl("jdbc:mysql://192.168.4.108:3306/rc_system?characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&useSSL=false");
        dataSource.setPassword("UcT6cbAhQ9PhB3Hn");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setInitialSize(10);
        dataSource.setMinIdle(30);
        dataSource.setMaxActive(100);
        dataSource.setMaxWait(6000);
        dataSource.setTimeBetweenEvictionRunsMillis(30000);
        dataSource.setMinEvictableIdleTimeMillis(60000);
        dataSource.setMaxEvictableIdleTimeMillis(90000);
        /**
         * 考虑性能问题：关闭false
         * setTestOnBorrow
         * setTestOnReturn
         */
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);

        return dataSource;
    }
}
