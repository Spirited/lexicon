package com.kompanets.lexicon.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

@Profile("mysql")
@Configuration
public class MySQLDataSourceConfiguration {
//    @NotNull
//    @Value("${username}")
//    private String username;
//
//    @Value("${password}")
//    @NotNull
//    private String password;
//
//    @Value("${url}")
//    @NotNull
//    private String url;
//
//    @Value("jdbc.driverClassName")
//    private String driverClassName;

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //com.mysql.jdbc.Driver
        //dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

//    @Bean
//    public DataSource getDataSource() {
//        System.out.println("=====> MySQL <====");
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//
//        return dataSource;
//    }
}
