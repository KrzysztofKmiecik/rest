package pl.kmiecik.rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String getHello() {
        return "Hello kmk";
    }

    @GetMapping("/moje")
    public String getMoje() {
        return "Moje";
    }
}
