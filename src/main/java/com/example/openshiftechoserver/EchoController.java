package com.example.openshiftechoserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/{msg}")
    public String getAnswer(@PathVariable String msg) {
        return "OpenshiftApp says: " + msg;
    }
}
