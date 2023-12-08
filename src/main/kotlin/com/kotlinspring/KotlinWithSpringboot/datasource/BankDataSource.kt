package com.kotlinspring.KotlinWithSpringboot.datasource

import com.kotlinspring.KotlinWithSpringboot.model.Bank
import org.springframework.stereotype.Component

@Component
class BankDataSource {
    // Dummy data for demonstration purposes
    private val banks: Collection<Bank> = listOf(
            Bank("ID1", "Bank A", 100.0),
            Bank("ID2", "Bank B", 200.0)
            // Add more banks as needed
    )

    fun retrieveBanks(): Collection<Bank> {
        // Return the collection of banks
        return banks
    }
}
