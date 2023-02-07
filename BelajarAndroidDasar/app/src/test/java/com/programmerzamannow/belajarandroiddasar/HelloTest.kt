package com.programmerzamannow.belajarandroiddasar

import Hello
import org.junit.Assert
import org.junit.Test

class HelloTest {
    @Test
    fun testSayHello() {
        val result = Hello.sayHello("Rivan")

        Assert.assertEquals("Hello Rivan", result)
    }
}