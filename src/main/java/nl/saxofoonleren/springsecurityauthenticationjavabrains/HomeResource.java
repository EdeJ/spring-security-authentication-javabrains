package nl.saxofoonleren.springsecurityauthenticationjavabrains;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/hello")
    public String hello() {
        return "HELLO WORLD";
    }
}
