package com.cpoletti.mysqlrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MysqlRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlRestApplication.class, args);
	}
}
