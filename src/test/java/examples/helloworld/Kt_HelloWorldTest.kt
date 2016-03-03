package examples.helloworld

import org.junit.Test;

import kotlin.test.assertEquals

class Kt_HelloWorldTest {

    @Test
    fun it_says_hello() {
        assertEquals(expected = "Hello, World!", actual = Kt_HelloWorld().sayHello())
        assertEquals(expected = "Hello, World!", actual = Kt_HelloWorld().sayHelloFromJava())
        assertEquals(expected = "Hello, World!", actual = Kt_HelloWorld().sayHelloFromGroovy())

        assertEquals(expected = "Hello, World!", actual = HelloWorld().sayHello())
        assertEquals(expected = "Hello, World!", actual = HelloWorld().sayHelloFromKotlin())
        assertEquals(expected = "Hello, World!", actual = HelloWorld().sayHelloFromGroovy())
    }
}