package spring.rest.consumer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

// write code to consume - 
// 1. get all emps 
// 2. get emp by id 
// 3. get all deps 
// 4. get dep by id (already done)


@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		App.log.info("Start");
		SpringApplication.run(App.class, args);
		App.log.info("End");

	}
}
