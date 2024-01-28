package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true) //for @secured & @roleAllowed resp.
public class SpringSecurityWIthJwtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWIthJwtBackendApplication.class, args);
	}

}
