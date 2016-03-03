package examples.helloworld;

public class HelloWorld {
    public String sayHello() {
        return "Hello, World!";
    }

    public String sayHelloFromKotlin() {
        return new Kt_HelloWorld().sayHello();
    }

    public String sayHelloFromGroovy() {
        return new Groovy_HelloWorld().sayHello();
    }
}

