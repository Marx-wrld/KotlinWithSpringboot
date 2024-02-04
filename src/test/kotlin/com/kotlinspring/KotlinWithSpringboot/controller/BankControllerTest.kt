package com.kotlinspring.KotlinWithSpringboot.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest //Triggers spring boot to initialize the entire application context and even start up the entire application for this tests
@AutoConfigureMockMvc

internal class BankControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc //Allows you to move http requests to your REST api without issuing any http requests

    @Test
    fun `Should return all banks` () {
        //when
        mockMvc.get("/api/banks")
            .andDo { print() }
            //then
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].accountNumber"){
                    value("1234")
                }
            }
        //given

        //given
    }

}