package pl.kmiecik.rest.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello World";
    }

    public String forMe() {
        return "Hello kmk";
    }


}
