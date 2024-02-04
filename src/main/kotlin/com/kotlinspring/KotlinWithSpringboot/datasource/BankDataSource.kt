package com.kotlinspring.KotlinWithSpringboot.datasource

import com.kotlinspring.KotlinWithSpringboot.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }
}
