package com.trgtR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.trgtR.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.trgtR"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TargetingRulesApp {

	public static void main(String[] args) {
		SpringApplication.run(TargetingRulesApp.class, args);
	}
}
