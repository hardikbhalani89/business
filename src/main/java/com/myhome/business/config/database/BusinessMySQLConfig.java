package com.myhome.business.config.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
public class BusinessMySQLConfig {

    @Primary
    @Bean(name="businessMySQLDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource businessMySQLDataSource(){
        return DataSourceBuilder.create().build();
    }
}
