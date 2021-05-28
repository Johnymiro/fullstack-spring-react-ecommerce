package com.training.springbootbuyitem.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class BuyItemApplication {

        public static void main(String[] args) {
            SpringApplication.run(BuyItemApplication.class, args);
        }

}
