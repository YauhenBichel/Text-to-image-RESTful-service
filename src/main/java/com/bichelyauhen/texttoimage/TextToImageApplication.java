package com.bichelyauhen.texttoimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TextToImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextToImageApplication.class, args);
	}

}
