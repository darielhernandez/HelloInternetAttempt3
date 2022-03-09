package com.careerdevs.HelloInternetAttempt3.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    /*
    * Method: GET
    * Path:/
    * Host: localhost:4000
    * URL: http://localhost:4000/
    * */

    @GetMapping("/")
    private String routeRoute(){
        return "You requested the root route";
    }
}
