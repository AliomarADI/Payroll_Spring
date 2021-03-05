package org.example.events.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "org.example.events")
//@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "org.example.events.repository")
public class Config {

}
