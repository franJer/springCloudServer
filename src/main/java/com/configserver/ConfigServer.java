package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    
	/*
	 * Test : 
	 * http://localhost:8888/config-client/development
	 * http://localhost:8888/message-service/default
	 * */
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }
}