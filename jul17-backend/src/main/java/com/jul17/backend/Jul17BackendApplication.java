package com.jul17.backend;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan( "com.jul17.backend.mapper")
public class Jul17BackendApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(Jul17BackendApplication.class, args);
    }
}
