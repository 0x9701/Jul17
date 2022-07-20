package com.jul17;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Jul17AuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(Jul17AuthApplication.class, args);
    }
}
