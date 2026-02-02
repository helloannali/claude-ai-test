package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Ensure the data directory exists for SQLite database
        File dataDir = new File("./data");
        if (!dataDir.exists()) {
            dataDir.mkdirs();
        }

        SpringApplication.run(DemoApplication.class, args);
    }
}
