package dev.sandrini.pirafrango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "dev.sandrini.pirafrango.domain")
public class PirafrangoApplication {

	public static void main(String[] args) {
		SpringApplication.run( PirafrangoApplication.class, args );
	}
}
