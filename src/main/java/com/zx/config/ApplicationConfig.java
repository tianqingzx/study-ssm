package com.zx.config;

import com.zx.bean.DataSourceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan(basePackageClasses = {DataSourceBean.class})
//@PropertySource(value = {"classpath:jdbc.properties"})
//@EnableTransactionManagement
//public class ApplicationConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    private DataSource dataSource = null;
//
//    @Bean
//    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }
//}
