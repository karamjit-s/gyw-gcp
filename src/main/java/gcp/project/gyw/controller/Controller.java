package gcp.project.gyw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	

    @GetMapping("/hello")
    public  String mainController() {

       

        return "index"; //view
    }

}
