package com.anyaudit;

import com.anyaudit.config.DatabaseConfig;
import com.anyaudit.config.DatabaseConfig1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DatabaseConfig1.class, DatabaseConfig.class}) // Add other configuration classes if needed
public class CampusApplication {
	public static void main(String[] args) {
		SpringApplication.run(CampusApplication.class, args);
	}
}

