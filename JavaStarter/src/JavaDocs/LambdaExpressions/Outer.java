package JavaDocs.LambdaExpressions;

public class Outer {

    @FunctionalInterface
    interface HelloWorld {
        //;Lambda expression build upon the expressions of interfaces??
        void greetSomeone(String name);
    }

    //
    void sayHello() {

//        Local classes sueful for encapsualtion, restricting access where it is not eneded i.e. this class is only available within the method, useful if its only relevant to this m,ethod also no point having it  outside
        //Local class also means it can be referred back to further on
        class NigerianGreeting implements HelloWorld {

            public void greetSomeone(String name) {
                int age = 18;
                if (age< 20) {
                    System.out.println("How body dey" + name);
                } else {
                    System.out.println("Good morning auntie");
                }
            }
        }
        //This is polymorphism-  because naijHey implements the itnerface, it can be used to create
        // any other class that implements it!- cooool
        HelloWorld naijahi = new NigerianGreeting();
        naijahi.greetSomeone("wisdom");
    }

    public static void main(String[] args) {
        Outer helloWorld = new Outer();

        helloWorld.sayHello();
    }
}
