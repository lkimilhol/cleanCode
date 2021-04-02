package com.best.practice.service

import org.junit.jupiter.api.*

@DisplayName("01. Easy String Test")
class StringWeek01Test {

    lateinit var fromReplace: String
    lateinit var fromSubstring: String

    @BeforeEach
    fun init() {
        fromReplace = "let is go !"
        fromSubstring = "good"
    }

    @Test
    @DisplayName(" Replace Test Success")
    fun replaceTest() {
        var replace: String = fromReplace.replace("!", "~")
        Assertions.assertEquals("let is go ~", replace)
    }

    @Test
    @DisplayName(" Substring Test Success")
    fun substringTest() {
        var substring: String = fromSubstring.substring(0, 2)
        Assertions.assertEquals("go", substring)
    }

    @Test
    @DisplayName(" String template")
    fun templateInnerTest(){
        var num = 1000
        val str = "I Like Number To : $num"
        Assertions.assertEquals("I Like Number To : 1000", str)
    }

    @Test
    @DisplayName(" String template")
    fun templateBracatInnerTest(){
        var num = 1000
        val str = "I Like Number To : ${num.minus(1)}"
        print("test : ${num is Int}")
        Assertions.assertEquals("I Like Number To : 999", str)
    }


    @Test
    @DisplayName(" String template")
    fun calculateAdd() {

    }

}