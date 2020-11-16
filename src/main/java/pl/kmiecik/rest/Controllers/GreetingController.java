package pl.kmiecik.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kmiecik.rest.Service.GreetingService;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    @GetMapping("/")
    public String getHello() {
        return greetingService.greet();
    }

    @GetMapping("/moje")
    public String getMoje() {
        return greetingService.forMe();
    }
}
