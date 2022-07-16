package com.jul17.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * todo  启动报错，无法监控
 */
@EnableAdminServer
@SpringBootApplication
public class Jul17MonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Jul17MonitorApplication.class, args);
    }

}
