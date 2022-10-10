package com.krian.spike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.krian.spike.mapper")
public class SpikeSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpikeSystemApplication.class, args);
	}
}
