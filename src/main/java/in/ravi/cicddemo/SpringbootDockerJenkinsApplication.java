package in.ravi.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerJenkinsApplication {

	@GetMapping("/jenkins")
	public String jenkins() {
		return "Welcome to CICD with Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJenkinsApplication.class, args);
	}

}
