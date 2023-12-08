package com.kotlinspring.KotlinWithSpringboot.service

import com.kotlinspring.KotlinWithSpringboot.datasource.BankDataSource
import com.kotlinspring.KotlinWithSpringboot.model.Bank
import org.springframework.stereotype.Service

//Reps our service for the banks use case and is the main entry point to a bank's business logic
//Creating a bank service for our app and creating a fast running unit test (CTRL + SHIFT + T)

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}