package JavaDocs.LambdaExpressions;

import java.util.function.Consumer;

public class HelloWorldWithConsumer {

    void sayHello() {
        Consumer<String> consumer = (String name ) -> {
            System.out.println("How body dey "+ name);

        };
        consumer.accept("Wisdom");
    }

    public static void main(String[] args) {
        HelloWorldWithConsumer hello = new HelloWorldWithConsumer();
        hello.sayHello();
        //In the case here this is an interface which consumes a value upon sintantiation rather than

    }
}
