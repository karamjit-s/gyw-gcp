package gcp.project.gyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GywApplication {

	public static void main(String[] args) {
		SpringApplication.run(GywApplication.class, args);
	}
	
	@RequestMapping("/")  
	public String hello()   
	{  
	return "GYW new App ! This app is under development";  
	}  

}
