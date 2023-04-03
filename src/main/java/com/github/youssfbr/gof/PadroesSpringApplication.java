package com.github.youssfbr.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author youssfbr
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesSpringApplication.class, args);
	}

}
