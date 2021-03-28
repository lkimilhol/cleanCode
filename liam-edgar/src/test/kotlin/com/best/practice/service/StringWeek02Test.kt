package com.best.practice.service

import org.junit.jupiter.api.*

@DisplayName("02. Easy String Test")
class StringWeek02Test {

    lateinit var fromInput: String

    @BeforeEach
    fun init() {
        fromInput = "3000 ? 1000"
    }

    @Test
    @DisplayName(" Calculate Detection Add Test Success")
    fun detectionAddTest() {
        fromInput = fromInput.replace("?","+")

        var x:Int = detectionNumber(fromInput)
        Assertions.assertEquals(4000, x)
    }

    @Test
    @DisplayName(" Calculate Detection Subract Test Success")
    fun detectionSubractTest() {
        fromInput = fromInput.replace("?","-")

        var x:Int = detectionNumber(fromInput)
        Assertions.assertEquals(2000, x)
    }

    @Test
    @DisplayName(" Calculate Detection Division Test Success")
    fun detectionDivisionTest() {
        fromInput = fromInput.replace("?","/")

        var x:Int = detectionNumber(fromInput)
        Assertions.assertEquals(3, x)
    }

    @Test
    @DisplayName(" Calculate Detection Multiplication Test Success")
    fun detectionMultiplicationTest() {
        fromInput = fromInput.replace("?","*")

        var x:Int = detectionNumber(fromInput)
        Assertions.assertEquals(3000000, x)
    }

    fun detectionNumber(source: String): Int {
        val operationLis = listOf<String>("+", "-", "/", "*")

        var outNumber:Int = 0
        for (operation: String in operationLis) {

            if (operation in source) {
                var n1:Int = source.trim().split(operation)[0].trim().toInt()
                var n2:Int = source.trim().split(operation)[1].trim().toInt()

                when (operation) {
                    "+" -> {
                        outNumber = n1 + n2
                        println("[$operation] -> $n1 $operation $n2 = $outNumber")
                    }
                    "-" -> {
                        outNumber = n1 - n2
                        println("[$operation] -> $n1 $operation $n2 = $outNumber")
                    }
                    "/" -> {
                        outNumber = n1 / n2
                        println("[$operation] -> $n1 $operation $n2 = $outNumber")
                    }
                    "*" -> {
                        outNumber = n1 * n2
                        println("[$operation] -> $n1 $operation $n2 = $outNumber")
                    }
                    else -> {
                        outNumber = 0
                        print("Invalid Calculate!!")
                    }
                }
            }
        }
        return outNumber
    }



}