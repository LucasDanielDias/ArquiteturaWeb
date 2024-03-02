package com.example.Clima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class Chamartempo {
    Service service = new Service();
    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }
}
