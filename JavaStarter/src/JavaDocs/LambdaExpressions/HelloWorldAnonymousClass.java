package JavaDocs.LambdaExpressions;

public class HelloWorldAnonymousClass {
    @FunctionalInterface
    interface HelloWorld {
        //;Lambda expression build upon the expressions of interfaces??
        void greetSomeone(String name);
    }


    void sayHello() {
        //This is an attempt to make an instance of the itnerface but as it is not implemented in a specific class it is known as an
        //anopnymopus class because you cannot instantiate an interface without a class
        HelloWorld helloWorld = new HelloWorld(){
            //In this case the interface is not attached to anything
            // It is implemented in an anonymous class i.e. the class doesnt exist out of scope as
            //there is no class name to refer to


            @Override
            public void greetSomeone(String name) {
                int age = 18;
                if (age< 20) {
                System.out.println("How body dey" + name);
                } else {
                    System.out.println("Good morning auntie");
                }
            }
     };
        helloWorld.greetSomeone("Fridah");

}

    public static void main(String[] args) {
        HelloWorldAnonymousClass helloWorldAnonymousClass  = new HelloWorldAnonymousClass();
        helloWorldAnonymousClass.sayHello();
    }
}
