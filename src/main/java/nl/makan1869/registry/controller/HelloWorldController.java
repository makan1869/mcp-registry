package nl.makan1869.registry.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




class HelloWorldResponse{
    private String message;

    public HelloWorldResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public HelloWorldResponse hello() {
        return new HelloWorldResponse("Hello, World!");
    }
}
