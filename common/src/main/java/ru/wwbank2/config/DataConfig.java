package ru.wwbank2.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by a.smirnov19 on 30/07/2017.
 */
@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("hikari.properties"));
        HikariConfig config = new HikariConfig(properties);
        return new HikariDataSource(config);
    }
}
