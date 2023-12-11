package com.kotlinspring.KotlinWithSpringboot.model

data class Bank(
    //A data class automatically creates a standard implementation of equals toHashCode and toString
    //when you declare a var or a val kotlin declares a getter for you
        val accountNumber: String,
        val trust: String,
        val transactionFee: Int
    //Kotlin we use primary constructor which is declared up here
)