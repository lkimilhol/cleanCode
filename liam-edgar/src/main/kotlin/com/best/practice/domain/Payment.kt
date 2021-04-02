package com.best.practice.domain

import lombok.Data

data class Payment(
    var paymentId: Long,
    var paymentType: String,
    var paymentPrice: Long
)