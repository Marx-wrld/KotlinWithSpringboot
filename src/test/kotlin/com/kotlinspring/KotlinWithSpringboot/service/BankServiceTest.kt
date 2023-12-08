package com.kotlinspring.KotlinWithSpringboot.service

import com.kotlinspring.KotlinWithSpringboot.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

//Using a mocking to mock the underlying data source (replacing any existing bean - (objects that form the backbone of an application) in the application context else adding a new one) and only test the service

internal class BankServiceTest{
    //choosing what to test

    private val dataSource: BankDataSource = mockk(relaxed = true) //Whenever a method is called it will just return a default value

    private val bankService = BankService(dataSource)
    @Test
    fun `should call its data source to retrieve banks`(){
        //when
        bankService.getBanks()

        //then - verifying that when we call the bankService it actually calls its data source (retrieveBanks)
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }

}