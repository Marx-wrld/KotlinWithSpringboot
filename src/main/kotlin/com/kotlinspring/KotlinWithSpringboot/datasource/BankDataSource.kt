package com.kotlinspring.KotlinWithSpringboot.datasource

import com.kotlinspring.KotlinWithSpringboot.model.Bank
import org.springframework.stereotype.Repository

@Repository

class BankDataSource {

    val banks = listOf(
        Bank("1234", "3.14", 17),
        Bank("1010", "17.0", 10),
        Bank("5678", "0.0", 100)
    )

    fun retrieveBanks(): Collection<Bank> {
        // Return the collection of banks
        return banks
    }
}
