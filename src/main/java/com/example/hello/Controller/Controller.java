package com.example.hello.Controller;

import com.example.hello.Model.Greeting;
import com.example.hello.Service.Implementation.GreetingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class Controller {

    private final GreetingServiceImpl greetingService;
    @GetMapping("/apple")
    public String whocaresaboutthis(){
        return "iphone";
    }

    @PostMapping("/salutation/{what}")
    public String salutation(@PathVariable String what){
        return what;
    }

    @PostMapping("/personalised")
    public String salutation(@RequestBody Greeting greeting){
        //return greeting.getSalutation() + greeting.getName() + ", " + greeting.getGreeting();
        return greetingService.customGreeting(greeting);
    }
}
