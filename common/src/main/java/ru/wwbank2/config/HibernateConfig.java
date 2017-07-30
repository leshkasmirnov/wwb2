package ru.wwbank2.config;

import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by a.smirnov19 on 30/07/2017.
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:hibernate.properties")
@Import(FlywayConfig.class)
public class HibernateConfig {

    @Autowired
    private Environment environment;

    @Autowired
    private DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean localSessionFactoryBean() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setPackagesToScan("ru.wwbank2.domain");
        localSessionFactoryBean.setHibernateProperties(getHibernateProperties());
        return localSessionFactoryBean;
    }

    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put(AvailableSettings.DIALECT, environment.getRequiredProperty("hibernate.dialect"));
        properties.put(AvailableSettings.SHOW_SQL, environment.getRequiredProperty("hibernate.show_sql"));
        properties.put(AvailableSettings.STATEMENT_BATCH_SIZE, environment.getRequiredProperty("hibernate.batch.size"));
        properties.put(AvailableSettings.HBM2DDL_AUTO, environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        properties.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, environment.getRequiredProperty("hibernate.current.session.context.class"));
        return properties;
    }
}
