package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Log
@Slf4j
@SpringBootApplication
public class Demo2LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2LombokApplication.class, args);
		log.severe("Ha habido un error");
	}

}
