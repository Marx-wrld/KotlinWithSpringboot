package com.kotlinspring.KotlinWithSpringboot.controller

import com.kotlinspring.KotlinWithSpringboot.model.Bank
import com.kotlinspring.KotlinWithSpringboot.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController //Tells spring boot to initialize our class and make it responsible for handling rest requests
@RequestMapping("api/banks") //Responsible for any endpoint in this class, also defines the path to use for any endpoint in this class

class BankController(private val service: BankService) {
    @GetMapping //Tells the compiler that this is supposed to be a GET endpoint (fetches data)
    fun getBanks(): Collection<Bank> = service.getBanks()
}