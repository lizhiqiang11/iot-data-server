package com.hnair.iot.dataserver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of IAM application.
 * 
 * @author Bin.Zhang
 */
@SpringBootApplication
public class Application {

	/**
	 * Start application
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}
}
