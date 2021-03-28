package com.best.practice.controller

import com.best.practice.domain.Payment
import com.best.practice.service.PaymentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentController(val paymentServie: PaymentService) {

    @GetMapping
    fun index(): String = "200"

    @GetMapping("/payments")
    fun payments(): List<Payment> {
        return paymentServie.paymentList()
    }

}