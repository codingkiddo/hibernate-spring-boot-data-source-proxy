package com.hibernate_spring_boot_data_source_proxy;

import com.hibernate_spring_boot_data_source_proxy.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootDataSourceProxyApplication {

    private final BookstoreService bookstoreService;

    public HibernateSpringBootDataSourceProxyApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateSpringBootDataSourceProxyApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.persistAuthor();
            bookstoreService.displayAuthor();
        };
    }
}
