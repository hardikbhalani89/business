package com.myhome.business.config.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

@Configuration
public class BusinessDBConfig {

    @Primary
    @Bean(name="businessDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource businessDataSource(){
        return DataSourceBuilder.create().build();
    }
}
