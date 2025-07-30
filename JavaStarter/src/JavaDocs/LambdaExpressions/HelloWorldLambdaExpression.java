package JavaDocs.LambdaExpressions;

public class HelloWorldLambdaExpression {
    @FunctionalInterface
    interface HelloWorld {
        //;Lambda expression build upon the expressions of interfaces??
        void greetSomeone(String name);
    }

    void sayHello() {
        //This is a step forward that just does the functionality rather than
        // having to create an anonymous class it assigns everythign
        HelloWorld helloWorld = (String name) -> {
            System.out.println("How body dey "+ name);
        };
        helloWorld.greetSomeone("Wisdom");
    }

    public static void main(String[] args) {
        HelloWorldLambdaExpression hello  = new HelloWorldLambdaExpression();
        hello.sayHello();
    }
}
