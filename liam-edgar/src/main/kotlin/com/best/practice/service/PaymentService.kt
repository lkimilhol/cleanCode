package com.best.practice.service

import com.best.practice.domain.Payment
import org.springframework.stereotype.Service
import java.util.*

@Service
class PaymentService {

    fun paymentList(): List<Payment> {
        return Arrays.asList(
            Payment(1, "NICE", 19000),
            Payment(2, "NICE", 200000)
        )
    }
}