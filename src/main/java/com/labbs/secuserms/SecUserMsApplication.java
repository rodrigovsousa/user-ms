package com.labbs.secuserms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SecUserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecUserMsApplication.class, args);
    }

}
