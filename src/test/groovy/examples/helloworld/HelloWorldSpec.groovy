package examples.helloworld

import spock.lang.Specification

class HelloWorldSpec extends Specification {

    def "it says hello"() {
        given:
        def world = new HelloWorld()

        expect:
        world.sayHello() == "Hello, World!"
        world.sayHelloFromKotlin() == "Hello, World!"
        world.sayHelloFromGroovy() == "Hello, World!"
    }

    def "it says hello to Kotlin"() {
        given:
        def world = new Kt_HelloWorld()

        expect:
        world.sayHello() == "Hello, World!"
        world.sayHelloFromJava() == "Hello, World!"
        world.sayHelloFromGroovy() == "Hello, World!"
    }
}
