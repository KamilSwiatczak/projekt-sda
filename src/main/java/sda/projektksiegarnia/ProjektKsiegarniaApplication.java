package sda.projektksiegarnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProjektKsiegarniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektKsiegarniaApplication.class, args);
	}

@RestController
public class HelloController {
		@GetMapping("/")
	String hello(){
			return "Tu powinny pojawić się książki. Kiedyś uda nam się je dodać ;) ";
		}
}
}
