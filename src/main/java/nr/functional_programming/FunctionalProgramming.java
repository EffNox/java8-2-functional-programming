package nr.functional_programming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgramming {

	public static void main(String[] args) {
        System.out.println(System.getProperty("java.runtime.version"));
		SpringApplication.run(FunctionalProgramming.class, args);
	}

}
