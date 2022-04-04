package monster.cephas.orginaizerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrginaizerbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrginaizerbackendApplication.class, args);
	};
    // test drive
    @GetMapping("/hello")
    public String hello(@RequestParam(value= "name", defaultValue="World") String name){
        return String.format("hello %s!", name);
    }

}
