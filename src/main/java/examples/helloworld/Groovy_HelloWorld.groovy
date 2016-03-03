package examples.helloworld

class Groovy_HelloWorld {
    public String sayHello() {
        "Hello, World!"
    }
    
    public String sayHelloFromJava() {
        new HelloWorld().sayHello()
    }
    
    public String sayHelloFromKotlin() {
        new Kt_HelloWorld().sayHello()
    }
}
