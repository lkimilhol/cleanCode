package com.best.practice.service

import org.junit.jupiter.api.*

@DisplayName("Easy String Test")
class StringCustomServiceTest {

    private lateinit var fromReplace: String
    private lateinit var fromSubstring: String

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
}