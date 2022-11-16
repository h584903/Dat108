package no.hvl.dat108.paamelding;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class PaameldingApplication extends SpringBootServletInitializer{
	
	private static Logger logger = Logger.getLogger(PaameldingApplication.class.getName());

	public static void main(String[] args) {
		logger.info("SPRING VERSION: " + SpringVersion.getVersion());
		SpringApplication.run(PaameldingApplication.class, args);
	}

}
