package com.github.yt.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectConfiguration {

    @Value("${yt.jdbc_username}")
    private String jdbc_username;

    @Value("${yt.jdbc_password}")
    private String jdbc_password;

    @Bean
    public DBConnection getConnConfig() {
        DBConnection dbConnection = new DBConnection(jdbc_username, jdbc_password);
        return dbConnection;
    }
}
