package com.careerdevs.HelloInternetAttempt3.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class NASAController {

    private String myNasaKey="TKfufd3xOD4wIhrxvWlBtZF687AGwtKTaQng1dmA";
    private String nasaApodEndpoint="https://api.nasa.gov/planetary/apod?api_key="+ myNasaKey;

    @GetMapping("/apod")
    public Object apodHandler (RestTemplate restTemplate){
        return restTemplate.getForObject(nasaApodEndpoint, Object.class);
    }
}
