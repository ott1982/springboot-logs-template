package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
        implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger("mylogger");

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args).close();
    }

    @Override
    public void run(String... args) {
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");
    }
}
