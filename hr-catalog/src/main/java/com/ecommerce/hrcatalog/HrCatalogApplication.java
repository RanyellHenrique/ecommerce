package com.ecommerce.hrcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrCatalogApplication.class, args);
    }

}
