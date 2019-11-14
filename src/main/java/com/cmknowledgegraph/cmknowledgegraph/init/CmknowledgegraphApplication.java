package com.cmknowledgegraph.cmknowledgegraph.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.cmknowledgegraph.cmknowledgegraph.database"})
@ComponentScan(basePackages = {"com.cmknowledgegraph.cmknowledgegraph.database", "com.cmknowledgegraph.cmknowledgegraph.repository", "com.cmknowledgegraph.cmknowledgegraph.controller"})
@EnableJpaRepositories({"com.cmknowledgegraph.cmknowledgegraph.repository"})

public class CmknowledgegraphApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(CmknowledgegraphApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CmknowledgegraphApplication.class, args);
    }

}
