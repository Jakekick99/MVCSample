package com.example.hello.Service.Implementation;

import com.example.hello.Model.Greeting;
import com.example.hello.Service.ServiceInterface.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public String customGreeting(Greeting greeting){
        return greeting.getSalutation() + greeting.getName() + ", " + greeting.getGreeting();
    }
}
