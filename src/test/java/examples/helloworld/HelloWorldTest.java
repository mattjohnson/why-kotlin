package examples.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void it_says_hello() throws Exception {
        assertEquals("Hello, World!", new HelloWorld().sayHello());
        assertEquals("Hello, World!", new HelloWorld().sayHelloFromKotlin());
        assertEquals("Hello, World!", new HelloWorld().sayHelloFromGroovy());

        assertEquals("Hello, World!", new Kt_HelloWorld().sayHello());
        assertEquals("Hello, World!", new Kt_HelloWorld().sayHelloFromJava());
        assertEquals("Hello, World!", new Kt_HelloWorld().sayHelloFromGroovy());
    }
}