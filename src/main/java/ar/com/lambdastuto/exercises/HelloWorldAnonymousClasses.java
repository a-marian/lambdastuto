package ar.com.lambdastuto.exercises;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
         void greet();
         void greetSomeone(String someone);
    }
    public void sayHello(){
        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override
            public void greet() {
                greetSomeone("World");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld slovakGreeting = new HelloWorld() {
            String name = "sveta";

            @Override
            public void greet() {
                greetSomeone("sveta");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Ahoj " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Marian");
        slovakGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
