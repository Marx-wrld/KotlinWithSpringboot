package com.kotlinspring.KotlinWithSpringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController //Tells spring boot to initialize our class and make it responsible for handling rest requests
@RequestMapping("api/hello") //Responsible for any endpoint in this class, also defines the path to use for any endpoint in this class

class HelloWorldController {

    @GetMapping //Tells the compiler that this is supposed to be a GET endpoint (fetches data)
    fun helloWorld(): String {
        return "Hello, this is a REST endpoint!"
    }
}