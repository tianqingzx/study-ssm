package com.zx.bean;

import com.zx.condition.DataSourceCondition;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@Conditional({DataSourceCondition.class})
public class DataSourceBean {

    @Value("${jdbc.database.driver}")
    private String driver = null;

    @Value("${jdbc.database.url}")
    private String url = null;

    @Value("${jdbc.database.username}")
    private String username = null;

    @Value("${jdbc.database.password}")
    private String password = null;

    @Bean("dataSource")
    @Scope("prototype")
    public DataSource getDataSource(){
        DataSource dataSource = null;
        Properties props = new Properties();
        props.setProperty("driver", driver);
        props.setProperty("url", url);
        props.setProperty("username", username);
        props.setProperty("password", password);

        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
