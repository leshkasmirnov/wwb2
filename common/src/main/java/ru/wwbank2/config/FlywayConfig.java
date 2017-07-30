package ru.wwbank2.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * Created by a.smirnov19 on 30/07/2017.
 */
@Configuration
@Import(DataConfig.class)
public class FlywayConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.migrate();
        return flyway;
    }
}
