package com.myhome.business.config.database;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

@Configuration
public class BusinessPGConfig {

    @Primary
    @Bean(name="businessPGDataSource")
    //@ConfigurationProperties(prefix = "spring.datasource")
    public DataSource businessPGDataSource(){
        return DataSourceBuilder.create().build();
    }
}
